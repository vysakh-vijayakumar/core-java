package interfaces;

public class Music {
			static void tune(Playable i) {
				i.play(Note1.MIDDLE_C);
			}
		
			static void tuneAll(Playable[] e) {
				for(Playable i : e){
					tune(i);
				}
			}
			public static void main(String[] args) {
				// Upcasting during addition to the array:
				Playable[] orchestra = {
					new Wind1(),
					new Percussion1(),
					new Stringed1(),
					new Brass1(),
					new Woodwind1()
				};
				tuneAll(orchestra);
			}
}	

enum Note1 {
	MIDDLE_C, C_SHARP, B_FLAT; 
}

interface Instrument1{
	// Compile-time constant:
	int VALUE = 5; // static & final
	// Cannot have method definitions:
	//void play(Note1 n); // Automatically public
	void adjust();
}

interface Playable{
	void play(Note1 n);	
}

class Wind1 implements Instrument1, Playable {
	public void play(Note1 n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Wind1"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Percussion1 implements Instrument1, Playable {
	public void play(Note1 n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Percussion1"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Stringed1 implements Instrument1, Playable {
	public void play(Note1 n) {
		System.out.println(this + ".play() " + n);
	}
	public String toString() { return "Stringed1"; }
	public void adjust() { System.out.println(this + ".adjust()"); }
}

class Brass1 extends Wind1 {
	public String toString() { return "Brass1"; }// No play method 
}

class Woodwind1 extends Wind1 {
	public String toString() { return "Woodwind1"; }
}