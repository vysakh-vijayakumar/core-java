package containers;

public class Equal_Hashcode {
	
	public static void main(String args){
		
	}
}

class Employee{
	
	private long empId;
	private String empFirtName;
	private String empLastName;
	
	@Override
	public boolean equals(Object o){
		 if(o == null)
			 return false;
		 if(!(o instanceof Employee))
			 return false;
		 
		 Employee other = (Employee)o;
		 if(this.empId != other.empId)
			 return false;
		 if(!(this.empFirtName.equals(other.empFirtName)))
			 return false;
		 if(!(this.empLastName.equals(other.empLastName)))
			 return false;
		 return true;
	}

	@Override
	public int hashCode(){
		return (int)this.empId * this.empFirtName.hashCode() * this.empLastName.hashCode();
	}
}