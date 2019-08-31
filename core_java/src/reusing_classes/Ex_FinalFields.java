package reusing_classes;

/* Create a class with a static final field and a
* final field and demonstrate the difference
* between the two.*/

public class Ex_FinalFields {
	public static void main(String args[]){
		System.out.println("First Object");
		System.out.println(new WithFinalFields());
		System.out.println("Second Object");
		System.out.println(new WithFinalFields());
	}
}

class SelfCounter{
	private static int count;
	private int id = count++;
	
	public String toString(){
		return " SelfCounter "+id+" count "+count;
	}
}

class WithFinalFields{
	
	final Integer i;//Blank final
	
	public WithFinalFields(){
		i = 0;//Must initialize the final
	}
	
	public Integer geti(){
		
		if(i == null){
			//i = new Integer(1);// Cannot assign a value to final variable.
		}
		return i ;
	}
	
	final SelfCounter fsc = new SelfCounter();
	static final SelfCounter sfsc = new SelfCounter();
	
	public String toString(){
		return " final_counter = "+fsc+" \n static_final_counter = "+sfsc;
	}
}
