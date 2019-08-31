package containers;

import java.util.Stack;

public class Stack_Collection{

	public static void main(String args[]){
		
		Stack<String> stack = new Stack<String>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("3");
		stack.push("5");
		stack.push("4");
	
		Object obj = stack.elements();
		System.out.println(obj);
		
		Object obj1 = stack.peek();
		System.out.println(obj1);
		
		int index = stack.search("4");
		System.out.println(""+index);
	}
}
