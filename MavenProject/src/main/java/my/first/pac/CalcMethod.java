package my.first.pac;

class Calculator

{
	public int calMeth(int b,int c) 
	{
	
	
	int a=b+c;
	
	return a;
	}
	
}

public class CalcMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int x=9;
		int y=8;
		
		Calculator obj=new Calculator();
		int r =obj.calMeth(x,y);
		System.out.println("Output is "+r);
		

	}

}
