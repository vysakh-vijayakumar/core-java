package innerclass;

public class InnerClass {
	public static void main(String args[]){
		Outer o = new Outer();
		Outer.Inner i = o.getInner();
	}
}

class Outer{
	class Inner{
		Inner(){
			System.out.println("Inner class is created");
		}
	}
	
	//This method cannot be static because , Object of inner
	//class cannot be created without outer class object.
	public /*static*/ Inner getInner(){
		return new Inner();
	}
}
