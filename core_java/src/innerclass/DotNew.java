package innerclass;

public class DotNew {
	class Inner{
		
	}
	
	public static void main(String args[]){
		DotNew dt = new DotNew();
		DotNew.Inner i = dt.new Inner();
		
		Outer1 o = new Outer1();
		Outer1.Inner1 in1 = o.new Inner1();
	}
}

class Outer1{
	class Inner1{
		
	}
}
