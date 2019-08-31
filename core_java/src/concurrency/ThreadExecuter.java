package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecuter {

	public static void main(String[] args) {
		System.out.println("CachedThreadPool Executer");
		ExecutorService cachedExec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i++){
			cachedExec.execute(new LiftOff());
		}
		cachedExec.shutdown();
		
		System.out.println("FixedThreadPool Executer");
		ExecutorService fixedExec = Executors.newFixedThreadPool(5);
		for(int i = 0; i < 5; i++){
			fixedExec.execute(new LiftOff());
		}
		fixedExec.shutdown();
		
		System.out.println("SingleThreadExecutor Executer");
		ExecutorService singleExec = Executors.newSingleThreadExecutor();
		for(int i = 0; i < 5; i++){
			singleExec.execute(new LiftOff());
		}
		singleExec.shutdown();
	}
	
}
