package errorhandling_with_exception;

public class A_YourOwnException {
	public void f() throws SimpleException{
		System.out.println("Throw Simple Exception from f()");
		throw new SimpleException();
	}
	
	public static void main(String args[]){
		A_YourOwnException ye = new A_YourOwnException();
		try {
			ye.f();
		} catch (SimpleException e) {
			System.out.println("Caught it");
			e.printStackTrace();//Information is going to standard error stream.
			e.printStackTrace(System.out);
			e.printStackTrace(System.err);
		}
	}
}

class SimpleException extends Exception{
	
}
