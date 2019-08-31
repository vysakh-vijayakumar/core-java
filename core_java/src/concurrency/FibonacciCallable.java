package concurrency;

import java.util.concurrent.Callable;

public class FibonacciCallable implements Callable<String> {

	private int n;
	public FibonacciCallable(int n){
		this.n = n;
	}
	
	private int fib(int i) {
		if(i < 2)
			return 1;
		return fib(i - 1) + fib(i - 2);
	}
	
	@Override
	public String call() throws Exception {
		return "Fib("+n+") is "+fib(n);
	}

}
