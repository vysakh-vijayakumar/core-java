package containers;

import java.util.ArrayList;
import java.util.Collection;

public class JavaCollection {
	
	public static void main(String args[]){
		Collection<Integer> c = new ArrayList<Integer>();
		for(int i = 0; i <10; i++){
			c.add(i);
		}
		
		c.add(2);
		c.add(3);
		
		for(Integer i : c){
			System.out.println(i+", ");
		}
	}
	
}
