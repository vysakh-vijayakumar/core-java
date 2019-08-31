package reusing_classes;

public class RuntimeTypeIdentification {
	public static void main(String args[]){
		Useful[] useful = {new Useful(), new MoreUseful(), new MoreUseful1()};
		((MoreUseful)useful[1]).u();// Downcast and RuntimeTypeIdentification
		((MoreUseful)useful[0]).u();// Throw ClassCastException cannot downcast.
		//((Useful)useful[0]).u(); // Compile time error.
	}
}

class Useful{
	public void f(){}
	public void g(){}
}

class MoreUseful extends Useful{
	@Override
	public void f(){}
	@Override
	public void g(){}
	public void u(){}
	public void v(){}
}

class MoreUseful1 extends Useful{
	@Override
	public void f(){}
	@Override
	public void g(){}
	public void v(){}
}