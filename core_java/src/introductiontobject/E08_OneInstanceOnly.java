package introductiontobject;

public class E08_OneInstanceOnly {
	
	static int value = 0;
	
	public static void main(String args[]){
		E08_OneInstanceOnly oneInstance1 = new E08_OneInstanceOnly();
		oneInstance1.value = 1;
		System.out.println("Object oneInstance1 value is : "+value);
		E08_OneInstanceOnly oneInstance2 = new E08_OneInstanceOnly();
		oneInstance2.value++;
		System.out.println("Object oneInstance2 value after increment is : "+value);
	}
}
