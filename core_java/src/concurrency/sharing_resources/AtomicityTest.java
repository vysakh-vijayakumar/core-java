package concurrency.sharing_resources;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AtomicityTest implements Runnable {

	private int i = 0;
	
	public int getValue()
	{
		return i;
	}
	
	private synchronized void incrementValue()
	{
		i++;
		i++;
	}
	
	@Override
	public void run() 
	{
		while(true)
		{
			incrementValue();
		}
	}
	
	public static void main(String[] args) 
	{
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicityTest at = new AtomicityTest();
		exec.execute(at);
		while(true)
		{
			int i = at.getValue();
			if(i % 2 != 0)
			{
				System.out.println(i);
				System.exit(0);
			}
		}
	}

}
