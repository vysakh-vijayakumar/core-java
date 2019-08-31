package programming.question;

public class PrimeNumber {
	
	public Boolean isPrimeNumber(int n){
		
		int i = 2;
		while(i < n){
			if(n % i == 0){
				return false;
			}
			i++;
		}
		
		return true;
	}
	
	public static void main(String args[]){
		PrimeNumber pn = new PrimeNumber();
		System.out.println(pn.isPrimeNumber(2));
	}
}
