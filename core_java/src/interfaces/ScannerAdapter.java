package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class ScannerAdapter extends CharSquence implements Readable{

	int count;
	public ScannerAdapter(int count){
		this.count = count;
	}
	
	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0){
			return -1;// Indicates the end of the input.
		}
		
		char[] bf = generate();
		cb.put(bf);
		return bf.length;
	}
	
	public static void main(String args[]){
		Scanner s = new Scanner(new ScannerAdapter(10));
		while(s.hasNext())
			System.out.println(s.next());
	}
}

class CharSquence{
	private char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private char[] vowels = "aeiou".toCharArray();
	Random r = new Random(47);
	
	public char[] generate(){
		char[] buffer = new char[10];
		int indx = 0;
		
		buffer[indx++] = capitals[r.nextInt(capitals.length)];
		
		for(int i = 0; i < 4; i++){
			buffer[indx++] = vowels[r.nextInt(vowels.length)];
			buffer[indx++] = lower[r.nextInt(lower.length)];
		}
		buffer[indx] = ' ';
		return buffer;
	}
}