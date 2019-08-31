package containers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * HashSet:- Not maintaining a insertion order and sorting order.
 *
 */

public class HashSet_Collection {
	
	public static void main(String args[]){
		
		Set<SetPerson> set = new HashSet<SetPerson>();
		
		set.add(new SetPerson(1, "A"));
		set.add(new SetPerson(3, "B"));
		set.add(new SetPerson(4, "C"));
		set.add(new SetPerson(2, "D"));
		set.add(new SetPerson(1, "E"));
		set.add(new SetPerson(1, "A"));
		set.add(new SetPerson(5, "B"));
		
		Iterator<SetPerson> iterator = set.iterator();
		while(iterator.hasNext()){
			SetPerson p = iterator.next();
			System.out.println(p.pName);
		}
	}
}

class SetPerson {
	
	public int pId;
	public String pName;
	
	public SetPerson(int id, String name){
		this.pId = id;
		this.pName = name;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == null)
			return false;
		if(!(o instanceof SetPerson))
			return false;
		
		SetPerson sp = (SetPerson)o;
		if((sp.pId == this.pId) || (sp.pName.equals(this.pName)))
			return true;
		/*if(!(sp.pName.equals(this.pName)))
			return false;*/
		return false;
	}
	
	@Override
	public int hashCode(){
		return this.pId;
	}
}
