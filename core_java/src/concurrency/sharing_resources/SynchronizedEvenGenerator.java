package concurrency.sharing_resources;

public class SynchronizedEvenGenerator extends IntGenerator {
	
	private int evenValue = 0;
	
	@Override
	public synchronized int next() {
		evenValue++;
		evenValue++;
		return evenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator());
	}
}
