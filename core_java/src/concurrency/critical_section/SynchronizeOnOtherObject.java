package concurrency.critical_section;

public class SynchronizeOnOtherObject {
	public static void main(String[] args) {
		final SyncObject s = new SyncObject();
		new Thread() {
			public void run(){
				s.a();
			}
		}.start();
		
		new Thread() {
			public void run(){
				s.b();
			}
		}.start();
		
		s.c();
	}
}

class SyncObject {
	
	private Object syncObjCommon = new Object();
	private Object syncObject1 = new Object();
	private Object syncObject2 = new Object();
	private Object syncObject3 = new Object();
	
	public void a() {
		synchronized (syncObjCommon) {
			for(int i = 0; i < 5; i++)
			{
				System.out.println("a"+ i);
				Thread.yield();
			}
		}
	}
	
	public void b() {
		synchronized (syncObjCommon) {
			for(int i = 0; i < 5; i++)
			{
				System.out.println("b"+ i);
				Thread.yield();
			}
		}
	}
	
	public void c() {
		synchronized (syncObjCommon) {
			for(int i = 0; i < 5; i++)
			{
				System.out.println("c"+ i);
				Thread.yield();
			}
		}
	}
}
