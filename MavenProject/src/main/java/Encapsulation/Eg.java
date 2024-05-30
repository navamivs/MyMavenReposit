package Encapsulation;
 class A{
	
	private int age=4;
	private String s="NVMZ";
	
int getValue()
{

System.out.println(s);	
return age;

}



}

public class Eg {
	
	public static void main(String[] args) 
	
	{
	
A obj=new A();	
System.out.println(+obj.getValue());




	}

}
