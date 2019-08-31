package reusing_classes;

class Villain{
	private String name;
	
	protected void set(String name){ // Use of protected access specifiers - accessible to child class(Orc).
		this.name = name;
	}
	
	public Villain(String name){
		this.name = name;
	}
	
	public String toString(){
		return "I'am Villain and my name is "+ name;
	}
}

public class Orc extends Villain {
	
	public int orcNumber;
	
	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber){
		set(name);
		this.orcNumber = orcNumber;
	}
	
	public String toString(){
		return "Number " + orcNumber + " && " + super.toString();
	}

	public static void main(String args[]){
		Orc orc = new Orc("name1", 1);
		System.out.println(orc);
		orc.change("name2", 2);
		System.out.println(orc);
	}
}
