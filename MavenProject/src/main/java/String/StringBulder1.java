package String;

public class StringBulder1 {

	public static void main(String[] args) {
		
		StringBuilder st=new StringBuilder("Hello");
		
		st.insert(0,"World ");//To insert a string on index 0
		System.out.println(st);
		
		st.replace(1, 5, "EX");//Replace 1 to 4 ie 4 cahr with EX
		
		
		System.out.println(st);
		
		st.delete(1, 3);//delete 1 to 2 characters
		System.out.println(st);
		
		st.append(" Here");//Add in last
		
		System.out.println(st);
		
		
		StringBuilder st1=new StringBuilder("Hello");
		StringBuilder st2=new StringBuilder("Hello");
		
		String s=st1.toString();
		String ss=st1.toString();
		
		
		
				
		System.out.println(s.equals(ss));
         
	}

}
