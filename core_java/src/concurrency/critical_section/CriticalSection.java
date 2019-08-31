package concurrency.critical_section;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CriticalSection 
{
	static void testSynchronizeApproaches(PairManager pm1, PairManager pm2)
	{
		ExecutorService exec = Executors.newCachedThreadPool();
		
		PairManipulator pman1 = new PairManipulator(pm1);
		PairManipulator pman2 = new PairManipulator(pm2);
		PairChecker pcheck1 = new PairChecker(pm1);
		PairChecker pcheck2 = new PairChecker(pm2);
		
		exec.execute(pman1);
		exec.execute(pman2);
		exec.execute(pcheck1);
		exec.execute(pcheck2);
		
		try 
		{
			TimeUnit.MILLISECONDS.sleep(5000);
		} catch (InterruptedException e) 
		{
			System.out.println("Sleep Interrupted");
		}
		
		System.out.println("pman1: "+ pman1+ "\n pman2: "+ pman2);
		System.exit(0);
	}
	
	public static void main(String[] args) 
	{
		PairManager pm1 = new PairManager1();
		PairManager pm2 = new PairManager2();
		testSynchronizeApproaches(pm1, pm2);
	}
}


class Pair
{
	private int x;
	private int y;
	
	public Pair(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void incrementX()
	{
		x++;
	}
	
	public void incrementY()
	{
		y++;
	}
	
	public String toString()
	{
		return "x: "+ x + ", y: " + y; 
	}
	
	public class PairValueNotEqualException extends RuntimeException 
	{
		public PairValueNotEqualException() 
		{
			super("Pair values are not equal: "+ Pair.this);
		}
	}
	
	public void checkState()
	{
		if(x != y)
			throw new PairValueNotEqualException();
	}
}

abstract class PairManager
{
	protected Pair pair = new Pair(0, 0);
	private List<Pair> storage = Collections.synchronizedList(new ArrayList<Pair>());
	protected AtomicInteger checkCounter = new AtomicInteger(0);
	
	public synchronized Pair getPair()
	{
		return new Pair(pair.getX(), pair.getY());
	}
	
	public void store(Pair p)
	{
		storage.add(p);
		try 
		{
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException ignore) {}
	}
	
	public abstract void increment();
}

class PairManager1 extends PairManager
{

	/*
	 * Synchronize entire method
	 */
	@Override
	public synchronized void increment() {
		pair.incrementX();
		pair.incrementY();
		store(getPair());
	}
}

class PairManager2 extends PairManager
{

	/*
	 * Use a critical section
	 */
	@Override
	public void increment() {
		Pair temp;
		synchronized (this) {
			pair.incrementX();
			pair.incrementY();
			temp = getPair();
		}
		store(temp);
	}
}

class PairManipulator implements Runnable
{
	private PairManager pm;
	public PairManipulator(PairManager pm)
	{
		this.pm = pm;
	}
	@Override
	public void run() {
		while(true)
			pm.increment();
	}
	
	public String toString()
	{
		return "Pair: " + pm.getPair() + ", CheckCounter: " + pm.checkCounter.get();
	}
}

class PairChecker implements Runnable
{
	private PairManager pm;
	public PairChecker(PairManager pm)
	{
		this.pm = pm;
	}

	@Override
	public void run() 
	{
		while(true)
		{
			pm.checkCounter.incrementAndGet();
			pm.getPair().checkState();
		}
	}
	
}
