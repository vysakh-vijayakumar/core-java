package interfaces;

public class NestingInterfaces {
	public class AB implements A.B{
		@Override
		public void f() {
		}		
	}
	
	public class AC implements A.C{
		@Override
		public void f() {	
		}
	}
	
	/*public class AD implements A.D{

		@Override
		public void f() {
			// TODO Auto-generated method stub
			
		}
		
	}*/
	
	class EImp implements E{
		@Override
		public void g() {	
		}
	}
	
	class EGImp implements E.G{
		@Override
		public void f() {	
		}
	}
	
	class EImp2 implements E{
		@Override
		public void g() {	
		}
		
		class EG implements E.G{
			@Override
			public void f() {	
			}
		}
	}
	
	public static void main(String args[]){
		A a = new A();
		//A.D ad = a.getD();//The type A.D is not visible
		//A.DImp2 ad = a.getD();//Type mismatch: cannot convert from A.D to A.DImp2
							    //Doesn’t return anything but A.D:
		//a.getD().f();//The type A.D is not visible
					   //Cannot access a member of the interface
		a.receiveD(a.getD());
	}
}

class A{
	interface B{
		void f();
	}
	
	public class BImp implements B{
		@Override
		public void f() {	
		}
	}
	
	private class BImp2 implements B{
		@Override
		public void f() {	
		}
	}
	
	public interface C{
		void f();
	}
	
	public class CImp implements C{
		@Override
		public void f() {			
		}
	}
	
	private class CImp2 implements C{
		@Override
		public void f() {			
		}
	}
	
	private interface D{
		void f();
	}
	
	private class DImp implements D{
		@Override
		public void f() {	
		}
	}
	
	public class DImp2 implements D{
		@Override
		public void f() {	
		}
	}
	
	public D getD(){
		return new DImp2();
	}
	
	D refD;
	public void receiveD(D d){
		refD = d;
		refD.f();
	}
}

interface E{
	interface G{
		void f();
	}
	
	public interface H{
		void f();
	}
	
	void g();
	
	/*private interface I{
					The interface member type I can only be public
	}*/
}