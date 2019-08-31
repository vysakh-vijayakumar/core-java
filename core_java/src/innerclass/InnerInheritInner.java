package innerclass;


class WithNonDefault{
	class Inner{
		private int i;
		public Inner(int i){
			this.i = i;
		}
		public Inner(){}
		void f(){
			System.out.println("Inner.f()");
		}
	}
}

public class InnerInheritInner {
	class Inner2 extends WithNonDefault.Inner{
		Inner2(WithNonDefault wn, int i){
			wn.super(i);
		}
		
		void f(){
			System.out.println("Inner2.f()");
			super.f();
		}
	}
	
	public static void main(String args[]){
		InnerInheritInner in = new InnerInheritInner();
		WithNonDefault wn = new WithNonDefault();
		Inner2 i2 = in.new Inner2(wn, 5);
		i2.f();
	}
}
