package containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class PrintingContainers_Integer {
	
	static Collection fill(Collection<Integer> collection){
		collection.add(1);
		collection.add(3);
		collection.add(2);
		collection.add(2);
		return collection;
	}
	
	static Map fill(Map<Integer, String> map){
		map.put(1, "A");
		map.put(3, "B");
		map.put(2, "C");
		map.put(2, "D");
		return map;
	}
	
	public static void main(String args[]){
		System.out.println(fill(new ArrayList<Integer>()));
		System.out.println(fill(new LinkedList<Integer>()));
		System.out.println(fill(new HashSet<Integer>()));
		System.out.println(fill(new TreeSet<Integer>()));
		System.out.println(fill(new LinkedHashSet<Integer>()));
		System.out.println(fill(new HashMap<Integer, String>()));
		System.out.println(fill(new TreeMap<Integer, String>()));
		System.out.println(fill(new LinkedHashMap<Integer, String>()));
		System.out.println(fill(new WeakHashMap<Integer, String>()));
	}
}
