package Aggregation;

public class Employee {

	int id;
	String name;
	Details obj2;
	
	public Employee(int id,String name,Details obj2)
	{
		this.id=id;
		this.name=name;
		this.obj2=obj2;
	}
	
	
	public void met()
	{
		
		System.out.println(id+"  "+name);
		System.out.println(obj2.city +" " +obj2.state+ " "+obj2.country);
	}
	public static void main(String[] args) {
		
		Details obj=new Details("Kannur","Kerala","India");
		Employee obj1=new Employee(5,"nvs",obj);
		obj1.met();
		

	}

}
