package interfaces;

import java.util.Arrays;
/**
 * 
 * Example of Strategy design pattern.
 * The Strategy is the object that you pass in,
 * and it contains code to be executed. Here, the Processor object is the Strategy.
 *
 */
public class Apply {
	static void process(Processor p, Object input){
		System.out.println("Using processor "+p.name());
		System.out.println(p.process(input));
	}
	
	public static void main(String args[]){
		String input = "Testing The Complete Decoupling Of Class";
		process(new Upcase(), input);
		process(new Downcase(), input);
		process(new Splitter(), input);
	}
}

class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	
	Object process(Object input){
		return input;
	}
}

class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}