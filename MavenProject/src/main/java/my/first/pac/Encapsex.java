package my.first.pac;

class Human
{
	
	private int age=10;;//age variable is accessible in the same class
	private String name;
	public int getData()

	{
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*public String getName()

	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}*/
	
	
	
}


public class Encapsex {

	public static void main(String[] args) {
		
		
		Human obj=new Human();
	    obj.setName("Navami");
	    Human obj1=new Human();
	    obj1.setName("Aravind");
		
	System.out.println(	obj.getData());
	System.out.println(	obj.getName());
	System.out.println(	obj1.getName());
	}

}
