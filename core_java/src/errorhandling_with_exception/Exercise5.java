package errorhandling_with_exception;

/**
 * Create your own resumption-like behavior using a while loop
 *  that repeats until an exception is no longer thrown.
 *
 */
public class Exercise5 {
	public static void main(String args[]){
		while(true){
			try {
				Resumer.f();
			} catch (Exception5 e) {
				e.printStackTrace();
				continue;
			}
			System.out.println("Exception will no longer thrown");
			break;
		}
	}
}

class Resumer{
	static int counter = 3;
	public static void f() throws Exception5{
		if(--counter > 0)
			throw new Exception5("Throw Exception5");
	}
}

class Exception5 extends Exception{
	public Exception5(String msg){
		
	}
}
