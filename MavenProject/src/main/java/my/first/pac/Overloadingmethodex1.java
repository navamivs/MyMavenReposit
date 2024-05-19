package my.first.pac;

class Calculator123
{
	public static double add(int x,int y)
	{
	
		return x+y;
	}
	
	public int add(int x,int y,int z)
	{
		
		return x+y+z;
	}	
	
	
	public static double add(int x,double y)
	{
		
		return x+y;
	}	
}
public class Overloadingmethodex1 {

	public static void main(String[] args) {
		
		Calculator123 obj=new Calculator123();
		double r =Calculator123.add(2,4);
		System.out.println("First add with two para "+r);
		int k=obj.add(2,3,5);
		System.out.println("Second add with three para "+k);
		double y=Calculator123.add(3,9.5d);
		System.out.println("Double Para" +y);
		
		
	}

}
