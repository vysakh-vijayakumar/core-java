package reusing_classes;

public class ReferenceCounting {
	public static void main(String args[]){
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
		for(Composing c: composing){
			c.dispose();
		}
	}
}

class Shared{
	private static long count = 0;
	private int refCount = 0;
	private final long id = count++;
	
	public Shared(){
		System.out.println("Creating "+this);
	}
	
	public void addRef(){
		refCount++;
	}
	
	protected void dispose(){
		if(--refCount == 0){
			System.out.println("Disposing "+this);
		}
	}
	
	@Override
	public String toString(){
		return "Shared "+id;
	}
}

class Composing{
	Shared shared;
	private static long count = 0;
	private final long id = count++;
	
	public Composing(Shared shared){
		System.out.println("Creating "+this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	public void dispose(){
		System.out.println("Disposing "+this);
		this.shared.dispose();
	}
	
	@Override
	public String toString(){
		return "Composing "+id;
	}
}