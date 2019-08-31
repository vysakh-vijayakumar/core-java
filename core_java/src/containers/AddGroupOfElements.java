package containers;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddGroupOfElements {
	
	public static void main(String args[]){
		Collection<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		
		Integer[] moreInt = {5, 6, 7, 8};
		c.addAll(Arrays.asList(moreInt));//c.addAll(Collection)
		
		Collections.addAll(c, 9, 10, 11, 12);
		Collections.addAll(c, moreInt);
		
		for(Integer i : c){
			System.out.println(i+", ");
		}
		
		//List list = Arrays.asList(13, 14);
	}
}
