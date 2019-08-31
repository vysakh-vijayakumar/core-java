package concurrency;

public class ResponsiveUI extends Thread {

	private static volatile double d = 1;
	
	public ResponsiveUI() {
		setDaemon(true);
		start();
	}
	
	@Override
	public void run() {
		while(d > 0){
			d = d + (Math.PI + Math.E) / d;
		}
	}
	
	public static void main(String[] args) throws Exception {
		new UnResponsiveUI();
		System.in.read();
		System.out.println("test");
	}
}

class UnResponsiveUI {
	
	private volatile double d = 1;
	public UnResponsiveUI() {
		while(d > 0){
			d = d + (Math.PI + Math.E) / d;
		}
	}
	
}
