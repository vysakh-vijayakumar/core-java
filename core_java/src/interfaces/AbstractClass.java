package interfaces;

public class AbstractClass {
	/*public static void main(String args[]){
		Instrument[] instruments = {new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()};
		tuneAll(instruments);
	}
	
	static void tune(Instrument i){
		i.play(new Note(Note.MIDDLE_C));
	}
	
	static void tuneAll(Instrument[] instruments){
		for(Instrument i : instruments){
			tune(i);
		}
	}*/
	
	public static void test1(NoMethods nm){
		((Extends1)nm).f();// Downcast required NoMethods class not contains the method f(). 
	}
	
	public static void test2(WithMethods wm){
		wm.f();// Downcast is necessary
	}
	
	public static void main(String args[]){
		NoMethods nm = new Extends1();
		test1(nm);
		WithMethods wm = new Extends2();
		test2(wm);
		WithMethods.g();
	}
}

abstract class Instrument{
	public abstract void play(Note note);
	String what() {
		return "Abstract Instrument";
	}
	public abstract void adjust();
}

 class Wind extends Instrument{

	@Override
	public void adjust() {
	}

	@Override
	public void play(Note note) {
		System.out.println("Wind.play() " + note);
	}
	
	@Override
	public String what(){
		return "Wind";
	}
}
 
class Percussion extends Instrument{

	@Override
	public void play(Note note) {
		System.out.println("Precussion.play() " + note);
	}

	@Override
	public void adjust() {
	}
	
	@Override
	public String what(){
		return "Percussion";
	}
}

class Stringed extends Instrument{

	@Override
	public void play(Note note) {
		System.out.println("Stringed.play() " + note);
	}

	@Override
	public void adjust() {
	}
	
	@Override
	public String what(){
		return "Stringed";
	}
}

class Brass extends Wind{
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	public void adjust() { System.out.println("Brass.adjust()"); }
}

class Woodwind extends Wind {
	public void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	public String what() { return "Woodwind"; }
}
 
class Note{
	String note;
	public static final String MIDDLE_A = "MIDDLE_A";
	public static final String MIDDLE_B = "MIDDLE_B";
	public static final String MIDDLE_C = "MIDDLE_C";
	public Note(String str){
		this.note = str;
	}
	@Override
	public String toString(){
		return note;
	}
}



abstract class NoMethods{	
}

class Extends1 extends NoMethods{
	public void f(){
		System.out.println("Extends1.f()");
	}
}

abstract class WithMethods{
	abstract public void f();
	public static void g(){
		System.out.println("WithMethods.g()");
	}
}

class Extends2 extends WithMethods{

	@Override
	public void f() {
		System.out.println("Extends2.f()");
	}
}