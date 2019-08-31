package innerclass;

public class UseOfInnerClass {
	public static void main(String args[]){
		X x = new X();
		Y y = new Y();
		takeA(x);
		takeB(x);
		takeA(y);
		takeB(y.makeB());
		
		Z z = new Z();
		takeD(z);
		takeE(z.makeE());
	}
	static void takeA(A1 a){};
	static void takeB(B1 b){};
	
	static void takeD(D d){};
	static void takeE(E e){};
}

/*
 * Implementing multiple interfaces without Innerclass is possible
 * example X implementing A1 and B1
 */
interface A1{}
interface B1{}

class X implements A1,B1{
	
}

class Y implements A1{
	B1 makeB(){
		return new B1() {
		};
	}
}

/*
 * But inheriting multiple classes without innerclass is not possible
 */
class D{}
abstract class E{}

class Z extends D{
	E makeE(){
		return new E() {
		};
	}
}