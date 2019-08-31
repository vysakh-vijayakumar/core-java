package reusing_classes;

import java.util.Random;

public class Ex_Shapes {
	public static void main(String args[]){
		RandomShapeGenerator r = new RandomShapeGenerator();
		/*Shape[] shapes = new Shape[9];
		for(int i = 0; i < shapes.length; i++){
			shapes[i] = r.next();
		}*/
		
		Shape[] shapes = {new Circle(), new Square(), new Triangle()};
		
		for(Shape s: shapes){
			s.draw();
			s.msg();
		}
	}
}

class RandomShapeGenerator {
	private Random r = new Random(47);
	
	public Shape next(){
		switch(r.nextInt(3)){
			default:
				
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
		}
	}
}

class Shape{
	public void draw(){System.out.println("Draw shape");}
	public void erase(){System.out.println("Erase shape");}
	public void msg(){System.out.println("Msg Shape");}
}

class Circle extends Shape { 
	@Override
	public void draw(){
		System.out.println("Draw circle");
	}
	
	@Override
	public void erase(){
		System.out.println("Erase circle");
	}
	
	@Override
	public void msg(){
		System.out.println("Msg circle");
	}
}

class Square extends Shape{
	@Override
	public void draw(){
		System.out.println("Draw square");
	}
	
	@Override
	public void erase(){
		System.out.println("Erase square");
	}
}

class Triangle extends Shape{
	@Override
	public void draw(){
		System.out.println("Draw triangle");
	}
	
	@Override
	public void erase(){
		System.out.println("Erase triangle");
	}
}