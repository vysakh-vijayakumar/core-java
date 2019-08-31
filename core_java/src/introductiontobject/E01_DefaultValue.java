package introductiontobject;

public class E01_DefaultValue {
	
	int i;
	char ch;
	double d;
	float f;
	boolean b;
	/**
	 * Default value is null because these are classes.
	 */
	String s;
	Integer in;
	Character cha;
	Boolean bol;
	Double db;
	Float fl;
	
	public E01_DefaultValue(){
		System.out.println("int default value : "+i);
		System.out.println("char default value : "+ch);
		System.out.println("double default value : "+d);
		System.out.println("float default value : "+f);
		System.out.println("boolean default value : "+b);
		System.out.println("String default value : "+s);
		System.out.println("Integer default value : "+in);
		System.out.println("Character default value : "+cha);
		System.out.println("Boolean default value : "+bol);
		System.out.println("Double default value : "+db);
		System.out.println("Float default value : "+fl);
	}
	
	public static void main(String args[]){	
		new E01_DefaultValue();
	}
}
