package programming.question;

/**
 * 
 * Program to swap two numbers without using temp variable.
 *
 */
public class SwapNumbers {

	public void swap(int a, int b){
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a: "+a+", b: "+b);
	}
	
	public static void main(String args[]){
		SwapNumbers sn = new SwapNumbers();
		int a = 10;
		int b = 20;
		sn.swap(a, b);
	}
}
