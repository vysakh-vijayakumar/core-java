package containers;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NevigableSet_Collection {
	
	public static void main(String args[]){
		NavigableSet<String> ns = new TreeSet<String>();
		NavigableSet<String> orginal = ns.descendingSet();
		
		orginal.add("1");
		orginal.add("2");
		orginal.add("3");
		orginal.add("4");
		orginal.add("5");
		
		Iterator<String> iterator = orginal.descendingIterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
