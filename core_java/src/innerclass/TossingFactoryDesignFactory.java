package innerclass;

public class TossingFactoryDesignFactory {
	public static void tossingConsumer(TossingFactory tf){
		Tossing t = tf.getTossing();
		while(t.event())
			;
	}
	public static void main(String args[]){
		tossingConsumer(CoinTossing.factory);
		tossingConsumer(DiceTossing.factory);
	}
}

interface Tossing{
	boolean event();
}

interface TossingFactory{
	Tossing getTossing();
}

class CoinTossing implements Tossing{

	private int event;
	private static final int EVENT = 2;
	
	@Override
	public boolean event() {
		System.out.println("Coin Tossing Event" + event);
		return ++event != EVENT;
	}
	
	public static TossingFactory factory = new TossingFactory(){
		@Override
		public Tossing getTossing() {
			return new CoinTossing();
		}
	};
	
}

class DiceTossing implements Tossing{

	private int event;
	private static final int EVENT = 6;
	@Override
	public boolean event() {
		System.out.println("Dice Tossing Event" + event);
		return ++event != EVENT;
	}
	
	public static TossingFactory factory = new TossingFactory() {
		@Override
		public Tossing getTossing() {
			return new DiceTossing();
		}
	};
	
}
