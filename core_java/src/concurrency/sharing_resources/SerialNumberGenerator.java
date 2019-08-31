package concurrency.sharing_resources;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SerialNumberGenerator {
	
	private static int serialNumber = 0;
	
	public static synchronized int nextSerialNumber()
	{
		return serialNumber++;
	}
	
	public static void main(String[] args) 
	{
		SerialNumberChecker.check();
	}
}

class CircularSet
{
	private int array[];
	private int index = 0;
	private int len;
	
	public CircularSet(int n)
	{
		array = new int[n];
		len = n;
		
		for(int i = 0; i < len; i++)
			array[i] = -1;
	}
	
	public void add(int val)
	{
		array[index] = val;
		index = ++index % len;
	}
	
	public boolean contains(int val)
	{
		for(int i = 0; i < len; i++)
			if(array[i] == val)
				return true;
		
		return false;
	}
}


class SerialNumberChecker
{
	private static final int SIZE = 10;
	private static CircularSet circularSet = new CircularSet(1000);
	private static ExecutorService exec = Executors.newCachedThreadPool();
	
	static class SerialChecker implements Runnable
	{
		@Override
		public void run() {
			while(true)
			{
				int serial = SerialNumberGenerator.nextSerialNumber();
				if(circularSet.contains(serial))
				{
					System.out.println("Duplicate entry found: "+ serial);
					System.exit(0);
				}
				
				circularSet.add(serial);
			}
		}
	}
	
	public static void check()
	{
		for(int i = 0; i < SIZE; i++)
		{
			exec.execute(new SerialChecker());
		}
	}
	
}