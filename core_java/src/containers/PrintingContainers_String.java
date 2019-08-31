package containers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;

public class PrintingContainers_String {

	static Collection fill(Collection<String> collection){
		collection.add("cat");
		collection.add("rat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	static Map fill(Map<String, String> map){
		map.put("cat", "A");
		map.put("rat", "B");
		map.put("dog", "C");
		map.put("dog", "D");
		return map;
	}
	
	public static void main(String args[]){
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String, String>()));
		System.out.println(fill(new TreeMap<String, String>()));
		System.out.println(fill(new LinkedHashMap<String, String>()));
		System.out.println(fill(new WeakHashMap<String, String>()));
	}
}
