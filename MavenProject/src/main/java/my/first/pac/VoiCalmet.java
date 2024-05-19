package my.first.pac;

public class VoiCalmet {
	
	public static void add(int a,int b)
	{
		int c=b+a;
		System.out.println("Sum" +c);
	}
	public static void sub(int a,int b)
	{
		int c=b-a;
		System.out.println("Subtraction" +c);
	}
	public static void mul(int a,int b)
	{
		int c=b*a;
		System.out.println("Product" +c);
	}
	
	public static void div(int a,int b)
	{
		int c=a/b;
		System.out.println("Division" +c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VoiCalmet.add(4,8);
		VoiCalmet.sub(4,8);
		VoiCalmet.mul(4,8);
		VoiCalmet.div(40,8);
		
		
		
	}

}
