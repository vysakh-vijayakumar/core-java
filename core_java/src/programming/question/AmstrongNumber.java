package programming.question;

public class AmstrongNumber {

	public Boolean  isAmstrong(int n){
		
		int temp;
		int value = 0;
		int number = n;
		while(n != 0){
			temp = n % 10;
			value += temp * temp * temp;
			n /= 10;
		}
		
		if(number == value){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public static void main(String args[]){
		AmstrongNumber an = new AmstrongNumber();
		System.out.println(an.isAmstrong(371));
	}
}
