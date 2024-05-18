package String;


public class Strieg {
	
	
		/*boolean equal(Strieg that)
		{
			String x=that.sb;
			String y=that.sb1;
			return x.equals(y);
		}*/
	

	public static void main(String[] args) {
		
		String name=new String("Navami");
		//String name="navami";
		String nm=new String("Naveen");
		name=name +"VS";
		System.out.println(name );		
System.out.println(name  +nm);
System.out.println(name.length() );
System.out.println(nm.charAt(2));	
System.out.println(nm.concat(name));
	
	StringBuffer sb=new StringBuffer("Aravind");//to make mutable
	StringBuffer sb1=new StringBuffer("Aravind");
	
	System.out.println(sb);
	System.out.println(sb.append(nm));	
	System.out.println(sb.deleteCharAt(5));
	System.out.println(sb.insert(2,"Killi"));
	
	
	
	String x=new String("Nvmz");
	String y=new String("Nvmz");
	
	
System.out.println((x.equals(y)));	

StringBuffer sb11=new StringBuffer("Aravind1");//to make mutable
StringBuffer sb12=new StringBuffer("Aravind1");

String xx=sb11.toString();
String yy=sb12.toString();
System.out.println(xx.equals(yy));
		
	
		
	
	}


}
