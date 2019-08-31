package interfaces;

public class FactoryDesignPattern {
	public static void serviceConsumer(ServiceFactory factory){
		Service s = factory.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String args[]){
		serviceConsumer(new ImplemFactory1());
		serviceConsumer(new ImplemFactory2());
	}
}

interface Service{
	void method1();
	void method2();
}

interface ServiceFactory{
	Service getService();
}

class Implem1 implements Service{

	Implem1(){
		
	}
	
	@Override
	public void method1() {
		System.out.println("Implem1.method1");	
	}

	@Override
	public void method2() {
		System.out.println("Implem1.method2");	
	}
}

class ImplemFactory1 implements ServiceFactory{

	@Override
	public Service getService() {
		return new Implem1();
	}
}

class Implem2 implements Service{

	Implem2(){
		
	}
	
	@Override
	public void method1() {
		System.out.println("Implem2.method1");	
	}

	@Override
	public void method2() {
		System.out.println("Implem2.method2");	
	}
}

class ImplemFactory2 implements ServiceFactory{

	@Override
	public Service getService() {
		return new Implem2();
	}
}