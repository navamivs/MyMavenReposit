package my.first.pac;
class Human1
{
private int age;
private String name;

public Human1()
{
	age=10;
	name="Navami";
}

public Human1(int age ,String name)
{
     int a=age;
String n=name;
	
	System.out.println(a+ " :"+n);
}

public int getAge()
{
	return age;
}

public void setAge(int age)
{
	this.age=age;
}


}

public class Thiscons {

	public static void main(String[] args) {
		
		
		
	Human1 obj=new Human1();
	Human1 obj1=new Human1(12,"Naveen");
    obj1.setAge(14);
	System.out.println( "check val with obj1 para constructor "+obj1.getAge());
	
	System.out.println( "check val with obj default constructor "+obj.getAge());
	}

}
