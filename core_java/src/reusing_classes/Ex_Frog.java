package reusing_classes;

class Amphibian{
	/*private String name;
	
	public Amphibian(String name){
		this.name = name;
	}
	
	public static void printDetails(Amphibian a){
		System.out.println(a.name);
	}*/
	
	public void moveInWater(){
		System.out.println("Amphibian can move in water");
	}
	
	public void moveInLand(){
		System.out.println("Amphibian can move in land");
	}
}

class Frog extends Amphibian {

	/*public Frog(String name) {
		super(name);
	}*/
	@Override
	public void moveInWater(){
		System.out.println("Frog can move in water");
	}
	
	@Override
	public void moveInLand(){
		System.out.println("Frog can move in land");
	}
}

public class Ex_Frog{
	public static void main(String args[]){
		Amphibian a = new Frog();
		a.moveInLand();
		a.moveInWater();
	}
}


