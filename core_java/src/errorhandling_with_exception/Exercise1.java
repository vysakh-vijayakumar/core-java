package errorhandling_with_exception;

public class Exercise1 {
	public static void main(String args[]) throws Exception1{
		try{
			throw new Exception1("Throw new Exception1");
		} catch(Exception1 e){
			e.printStackTrace();
		} finally{
			System.out.println("Finally block is executed");
		}
	}
}

class Exception1 extends Exception{
	public Exception1(String msg){
		super(msg);
	}
}