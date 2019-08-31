package concurrency;

public class Joining {
	public static void main(String[] args) {
		Sleeper s1 = new Sleeper(1500, "S1");
		Sleeper s2 = new Sleeper(1500, "S2");
		
		Joiner j1 = new Joiner(s1, "J1");
		Joiner j2 = new Joiner(s2, "J2");
		s2.interrupt();
	}
}

class Sleeper extends Thread {
	private int duration;
	public Sleeper(int duration, String name) {
		super(name);
		this.duration = duration;
		start();
	}
	
	@Override
	public void run() {
		try {
			sleep(duration);
		} catch (InterruptedException e) {
			System.out.println(getName() + " was interupted isInterrupted: "+ isInterrupted());
			return;
		}
		System.out.println(getName() + " has awakened");
	}
}

class Joiner extends Thread {
	private Sleeper sleeper;
	public Joiner(Sleeper sleeper, String name) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	
	@Override
	public void run() {
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println(getName() + " Join Interrupted");
		}
		
		System.out.println(getName() + " Join Compeleted");
	}
}

