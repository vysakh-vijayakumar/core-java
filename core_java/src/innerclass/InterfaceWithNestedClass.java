package innerclass;

public class InterfaceWithNestedClass{
	public static void main(String ars[]){
		ContainsNestedClass.Nested ne = new ContainsNestedClass.Nested(1);
		ne.f();
	}
}

class A implements ContainsNestedClass{
	
}

interface ContainsNestedClass{
	class Nested{
		private int i;
		public Nested(int i){
			this.i = i;
		}
		void f(){
			System.out.println("Nested.f()");
		}
	}
}
