package reusing_classes;

class Initialization_with_Inheritance {
	public static void main(String args[]){
		//Beetle.k = 1000;
		Beetle b = new Beetle();
		//Beetle b1 = new Beetle();
	}
}

class Insect{
	
	private int i = 1;
	protected int j;
	
	Insect(){
		System.out.println("i = "+i+" j = "+j);
	}
	static{
		System.out.println("Insect loading test");
	}
	
	private int x1 = printInit("Insect.x1 is initialized");
	
	static int printInit(String s){
		System.out.println(s);
		return 5;
	}
}
 
class Beetle extends Insect{
	public int k = printInit("Beetle.k is initialized");
	
	Beetle(){
		//System.out.println("Beetle constructor");
		System.out.println("j = " + j + " k = "+ k);
	}
	
	static{
		System.out.println("Beetle loading test");
	}
}