package innerclass;
/*
 * Iterator design pattern example.
 */
interface Selector{
	boolean end();
	Object current();
	void next();
}

public class Sequence {

	private Object[] items;
	private int next = 0;
	
	public Sequence(int size){
		items = new Object[size];
	}
	
	public void add(Object o){
		if(next < items.length)
			items[next++] = o;
	}
	
	public Selector getSelector(){
		return new SequenceSelector();
	}
	
	public Selector reverseSelector(){
		return new ReverseSelector();
	}
	
	private class SequenceSelector implements Selector{
		int i = 0;
		@Override
		public boolean end() {
			return i == items.length;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i < items.length)
				i++;
		}
	}
	
	private class ReverseSelector implements Selector{
		int i = items.length - 1;
		@Override
		public boolean end() {
			return i < 0;
		}

		@Override
		public Object current() {
			return items[i];
		}

		@Override
		public void next() {
			if(i >= 0)
				i--;
		}
	}
	
	public static void main(String args[]){
		final int SEQUENCE_LENGTH = 10;
		Sequence s = new Sequence(SEQUENCE_LENGTH);
		for(int i = 0; i < SEQUENCE_LENGTH; i++){
			s.add(new StringHolder(Integer.toString(i)));
		}
		Selector sl = s.getSelector();
		while(!sl.end()){
			System.out.println(sl.current());
			sl.next();
		}
	}
}

class StringHolder{
	private String data;
	StringHolder(String str){
		data = str;
	}
	@Override
	public String toString(){
		return data;
	}
}