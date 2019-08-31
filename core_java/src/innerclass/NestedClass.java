package innerclass;

public class NestedClass {
	public static void main(String args[]){
		// Specifying the nested type outside
		// the scope of the class
		//Outside the class it should specify like this.
		Outer3.Inner i = new Outer3.Inner();
	}
}

class Outer3{
	//Nested class it is static inner class
		static class Inner{
			
		}
		
		//Normal Inner Class.
		class  Inner1{
			
		}
		
		public static void access(){
			Inner i = new Inner();
			//Cannot create the object of normal inner class directly.
			//needs to create object of the outer class.
			//Inner1 i1= new Inner1();
		}
}
