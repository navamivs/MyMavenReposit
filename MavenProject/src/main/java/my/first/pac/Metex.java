package my.first.pac;

public class Metex {
	
	
	public String cal(String a)
	{
	String nm="Vimaldas";

	System.out.println(a.concat(nm));
	return a+nm;
	
	
	}

	public static void main(String[] args) {
	
		
		Metex obj=new Metex();
	
		
		String r=obj.cal("Navami");
		
		System.out.println(r);

	}

}
