package my.first.pac;

class Calc
{
	
public static int add(int x,int y)
{
	return x+y;
}
	
public static int sub(int x,int y)
{
	return x-y;
}
		
public static int mul(int x,int y)
{
	return x*y;
}

public static int div(int x,int y)
{
	return x/y;
}

	
}



public class Calcumeth {

	public static void main(String[] args) {
		
int i=Calc.add(3, 8);
int k=Calc.sub(7, 3);
//int s=Calc.mul(8, 10);
//int u=Calc.div(80,10);
System.out.println("Added Value"+i);
System.out.println("Sub Value"+k);
System.out.println("Mul Value"+Calc.mul(8, 10));
System.out.println("Div Value"+ Calc.div(80,10));
	}

}
