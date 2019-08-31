package containers;

import java.util.Arrays;
import java.util.Comparator;

public class Comparator_Comparable {
	
	public static void main(String args[]){
		
		Person p[] = new Person[4];
		
		Person p1 = new Person(1,"B");
		Person p2 = new Person(2,"A");
		Person p3 = new Person(3,"C");
		Person p4 = new Person(4,"D");
		
		p[0] = p1;
		p[1] = p2;
		p[2] = p3;
		p[3] = p4;
		
		Arrays.sort(p, Person.PersonComparator);
		
		for(Person p_pointer: p){
			System.out.println(p_pointer.person_name);
		}
	}
}

class Person implements Comparable<Person>{
	
	public int person_id;
	public String person_name;
	
	public Person(int id, String name){
		this.person_id = id;
		this.person_name = name;
	}

	@Override
	public int compareTo(Person other) {
		return (this.person_id - other.person_id);
	}
	
	public static Comparator<Person> PersonComparator = new Comparator<Person>() {
		
		@Override
		public int compare(Person p1, Person p2) {
			
			String name1 = p1.person_name.toUpperCase();
			String name2 = p2.person_name.toUpperCase();
	
			return name2.compareTo(name1);
		}
	};
}
