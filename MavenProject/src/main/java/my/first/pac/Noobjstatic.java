package my.first.pac;

public class Noobjstatic {
	
	
	static
	{
		System.out.println(" No object created as there is no constructor or instance method so class.forname is used");
	}

	public static void main(String[] args)throws ClassNotFoundException
	
	{
		
		Class.forName( "Noobjstatic");
		

	}

}
