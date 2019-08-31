package containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Sorting {

	public static void main(String args[]){
		
		List<Person> list = new ArrayList<Person>();
		list.add(new Person(1, "A"));
		list.add(new Person(3, "B"));
		list.add(new Person(4, "C"));
		list.add(new Person(2, "D"));
		
		Collections.sort(list, Person.PersonComparator);
		//Collections.sort(list);
		
		Iterator<Person> iterator = list.iterator();
		while(iterator.hasNext()){
			Person p = iterator.next();
			System.out.println(p.person_name);
		}
	}
}


