package containers;

import java.util.Collection;
import java.util.HashSet;
/**
 * Set don't allow duplicate values.
 */
public class Collection_Set {

	public static void main(String args[]){
		Collection<Integer> c = new HashSet<Integer>();
		
		for(int i = 0; i < 10; i++){
			c.add(i);//Autoboxing.
		}
		//Adding duplicate values.
		c.add(2);
		c.add(5);
		
		for(Integer i : c){
			System.out.println(i+", ");
		}
	}
}
