package innerclass;

interface SimpleInterface{
	void f();
}

class Outer2{
	private class Inner implements SimpleInterface{
		@Override
		public void f() {
			System.out.println("Inner.f()");
		}
	}
	
	public SimpleInterface get(){
		return new Inner();
	}
	
	public Inner get2(){
		return new Inner();
	}
}

public class HiddenInnerClass {
	Outer2 o = new Outer2();
	SimpleInterface si = o.get();
	SimpleInterface si1 = o.get2();
	
	//Inner is not visible because it is private
	//Inner i = o.get();
	//Inner i1 = o.get2();
}
