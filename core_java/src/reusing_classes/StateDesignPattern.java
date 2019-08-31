package reusing_classes;

/**
 *This is an example of the State design pattern, wherein the object’s behavior is
 *state-dependent
 */

public class StateDesignPattern {
	public static void main(String args[]){
		Starship starship = new Starship();
		System.out.println(starship);
		starship.setStatus(new RedAlertStatus());
		System.out.println(starship);
		starship.setStatus(new YellowAlertStatus());
		System.out.println(starship);
	}
}

class AlertStatus{
	public String getStatus(){
		return "None";
	}
}

class RedAlertStatus extends AlertStatus{
	@Override
	public String getStatus(){
		return "Red";
	}
}

class GreenAlertStatus extends AlertStatus{
	@Override
	public String getStatus(){
		return "Green";
	}
}

class YellowAlertStatus extends AlertStatus{
	@Override
	public String getStatus(){
		return "Yellow";
	}
}

class Starship{
	AlertStatus alertStatus = new GreenAlertStatus();
	
	public void setStatus(AlertStatus status){
		alertStatus = status;
	}
	
	@Override
	public String toString(){
		return alertStatus.getStatus();
	}
}