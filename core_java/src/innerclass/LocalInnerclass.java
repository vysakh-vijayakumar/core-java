package innerclass;

/*
 * PDestination is local inner class
 *It is created inside a method.
 */

interface Destination{
	String readLabel();
}

public class LocalInnerclass {
	public Destination destination(String s){
		class PDestination implements Destination{
			private String label;
			public PDestination(String whereTo){
				label = whereTo;
			}
			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}
	
	public static void main(String args[]){
		LocalInnerclass li = new LocalInnerclass();
		Destination d = li.destination("dest1");
	}
}
