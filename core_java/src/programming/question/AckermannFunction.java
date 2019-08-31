package programming.question;

public class AckermannFunction {

	public long A(long m, long n){
		
		if(m == 0)
			return n + 1;
		else if(m > 0 && n == 0)
			return A(m -1, 1);
		else if(m > 0 && n > 0)
			return A(m - 1, A(m, n - 1));
		else
			return 0;
	}
	
	public static void main(String args[]){
		AckermannFunction obj = new AckermannFunction();
		System.out.println(""+obj.A(4, 5));
	}
}
