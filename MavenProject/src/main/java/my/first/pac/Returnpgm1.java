package my.first.pac;

public class Returnpgm1 {

public static int add(int a,int b)
{
	int sum=a+b;
	return sum;
}
public static String stri(String n)
{
	System.out.println("Printing code");
	return n;
}

	
	

	public static void main(String[] args) {
		//Returnpgm1.add(3 ,8);
		
		System.out.println(Returnpgm1.add(3 ,8));
		System.out.println("String Printing  "+Returnpgm1.stri("Nav"));
	}

}
