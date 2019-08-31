package innerclass;

class NoDefault{
	private int i;
	public NoDefault(int i){
		this.i = i;
	}
	
	public void f(){
		System.out.println("NoDefault.f()");
	}
}

class Second{
	public NoDefault get1(){
		return new NoDefault(2);
	}
	
	public NoDefault get2(){
		return new NoDefault(3){
			@Override
			public void f(){
				System.out.println("Second.get2.f()");
			}
		};
	}
}

public class ReturnAnonymousIC {
	public static void main(String args[]){
		Second s = new Second();
		NoDefault nd = s.get1();
		nd.f();
		NoDefault nd1 = s.get2();
		nd1.f();;
	}
}
