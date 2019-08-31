package concurrency.sharing_resources;

public class EvenGenerator extends IntGenerator {

	private int evenValue = 0;
	
	@Override
	public int next() {
		evenValue++;
		evenValue++;
		return evenValue;
	}
	
	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator());
	}

}
