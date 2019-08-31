package concurrency;

import java.util.Arrays;

public class Fibonacci implements Runnable {
	
	private int n;
	private int count = 0;
	
	public Fibonacci(int n) {
		this.n = n;
	}
	
	public int fib(int i) {
		if(i < 2)
			return 1;
		return fib(i - 2) + fib(i - 1);
	}
	
	public int next() {
		return fib(count++);
	}

	@Override
	public void run() {
		Integer sequence[] = new Integer[n];
		for(int i = 0; i < n; i++)
			sequence[i] = next();
		System.out.println("Sequence Of "+ n +" : " + Arrays.toString(sequence));
	}
	
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			new Thread(new Fibonacci(i)).start();
	}
	

}
