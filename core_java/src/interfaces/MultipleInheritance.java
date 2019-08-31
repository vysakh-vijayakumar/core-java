package interfaces;

public class MultipleInheritance {
	public static void t(canFight x){
		x.fight();
	}
	
	public static void u(canSwim x){
		x.swim();
	}
	
	public static void v(canFly x){
		x.fly();
	}
	
	public static void w(ActionCharacter x){
		x.fight();
	}
	
	public static void main(String args[]){
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
	}
}

interface canFight{
	void fight();
}

interface canSwim{
	void swim();
}

interface canFly{
	void fly();
}

interface CanClimb{
	void climb();
}

class ActionCharacter{
	public void fight(){};
}

class Hero extends ActionCharacter implements canFight, canSwim, canFly{
	public void swim(){};
	public void fly(){};
	//public void fight(){};
}