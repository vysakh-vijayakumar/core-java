package interfaces;

public class TossingFactoryDesignPattern {
	public static void simulate(TossingFactory tf){
		Tossing t = tf.getTossing();
		while(t.event())
			;
	}
	
	public static void main(String args[]){
		simulate(new CoinTossingFactory());
		simulate(new DiceTossingFactory());
	}
}

interface Tossing{
	boolean event();
}

interface TossingFactory{
	Tossing getTossing();
}

class CoinTossing implements Tossing{

	int event;
	private static final int EVENT = 2;
	
	@Override
	public boolean event(){
		System.out.println("Coin Tossing event"+ event);
		return ++event != EVENT;
	}
}

class CoinTossingFactory implements TossingFactory{

	@Override
	public Tossing getTossing() {
		return new CoinTossing();
	}
}

class DiceTossing implements Tossing{

	int event;
	private static final int EVENT = 6;
	
	@Override
	public boolean event(){
		System.out.println("Dice Tossing event"+ event);
		return ++event != EVENT;
	}
}

class DiceTossingFactory implements TossingFactory{

	@Override
	public Tossing getTossing() {
		return new DiceTossing();
	}
}
