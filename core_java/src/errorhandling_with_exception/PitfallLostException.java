package errorhandling_with_exception;

class VeryImportantException extends Exception{
	@Override
	public String toString(){
		return "A very imporant exception";
	}
}

class TrivialException extends Exception{
	@Override
	public String toString(){
		return "A Trivial exception";
	}
}


public class PitfallLostException {
	public void f() throws VeryImportantException{
		throw new VeryImportantException();
	}
	
	public void g() throws TrivialException{
		throw new TrivialException();
	}
	
	public static void main(String args[]){
		PitfallLostException p = new PitfallLostException();
		try{
			try{
				p.f(); // VeryImportant exception is thrown but it is lost.
			}finally{
				 p.g();
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
}
