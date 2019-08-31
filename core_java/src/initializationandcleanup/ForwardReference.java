package initializationandcleanup;

public class ForwardReference {

	public void initialize(){
		//Forward Reference: Legal
		this.i = 0;
	}
	
	public void illegalForwardRefernce(){
		int c = 3;
		//int a = b; //Forward Reference: Illegal
		int b = c;
	}
	
	int i;
	int j;
}
