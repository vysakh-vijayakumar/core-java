package innerclass;

interface Contents{
	int value();
}

class Parcel{
	public Contents contents(){
		/*
		 * AnonymousInnerClass it has no name. 
		 */
		return new Contents(){
			
			private int i;
			@Override
			public int value() {
				return i;
			}
		};
	}
}

class Parcel1{
	public Wrapping wrapping(int x, final String s){
		/*
		 * Base class has constructor with argument.
		 */
		return new Wrapping(x){
			/*
			 * Cannot refer to a non-final variable s inside an inner class defined in a different method
			 * 's' should be final.
			 */
			String str = s;
			public int value(){
				return super.value() * 10;
			}
		};
	}
}

class Wrapping{	
	private int i;
	public Wrapping(int x){
		i = x;
	}
	
	public int value(){
		return i;
	}
}

public class AnonymousInnerClass {
	public static void main(String args[]){
		Parcel p = new Parcel();
		Contents c = p.contents();
		System.out.println(c.value());
		
		Parcel1 p1 = new Parcel1();
		Wrapping w = p1.wrapping(5, "str");
		System.out.println(w.value());
	}
}


