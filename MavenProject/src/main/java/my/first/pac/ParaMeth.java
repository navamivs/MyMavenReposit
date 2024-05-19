package my.first.pac;



public class ParaMeth {
	
	public static void abc()
	{
		System.out.println("Default Method");
	}
	
	public static void getNam(String n)
	{
		System.out.println("My second parameter name= "+n);
	}

	public static void main(String[] args) {
		
		ParaMeth.abc();
		ParaMeth.getNam("Navami");
		// TODO Auto-generated method stub

	}

}
