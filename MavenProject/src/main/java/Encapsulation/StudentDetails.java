package Encapsulation;

class Students
{
	private String name;
	private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	
	
}


public class StudentDetails {

	public static void main(String[] args) {
		Students obj=new Students();
		obj.setName("Madhav");
		obj.setRoll(9);
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
		

	}

}
