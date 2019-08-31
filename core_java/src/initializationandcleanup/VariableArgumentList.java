package initializationandcleanup;

public class VariableArgumentList {

	public static void printArray(Object[] objects){
		for(Object obj: objects){
			System.out.println(obj.toString() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		printArray(new Object[]{new Integer(1), new Float(1.12), new Double(1.85), "String", new A()});
		printArray(new Object[]{new A(), new A(), new A()});
	}
}

class A{}
