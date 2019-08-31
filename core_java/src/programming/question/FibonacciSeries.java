package programming.question;

public class FibonacciSeries {

	public int fibonacciSeries(int limit){
		
		if(limit == 1 || limit == 0){
			//System.out.println(1);
			return limit;
		}
		
		int result = fibonacciSeries(limit - 2) + fibonacciSeries(limit - 1);
		return result;
	}
	
	public static void main(String args[]){
		FibonacciSeries fb = new FibonacciSeries();
		
		for(int i = 0; i <= 25; i++){
			System.out.println(fb.fibonacciSeries(i));
		}
	}
}
