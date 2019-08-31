package innerclass;

class WithInner{
	class Inner{
		
	}
}

public class InheritInnerClass extends WithInner.Inner {
	//InheritInnerClass(){}//Won't compile.
	InheritInnerClass(WithInner wi){
		wi.super();
	}
	
	public static void main(String args[]){
		WithInner wi = new WithInner();
		InheritInnerClass i = new InheritInnerClass(wi);
	}
}
