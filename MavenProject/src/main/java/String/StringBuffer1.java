package String;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		
StringBuffer st=new StringBuffer("Hello");
		
		st.insert(0,"World ");//To insert a string on index 0
		System.out.println(st);
		
		st.replace(1, 5, "EX");//Replace 1 to 4 ie 4 cahr with EX
		
		
		System.out.println(st);
		
		st.delete(1, 3);//delete from 1 to 2 characters
		System.out.println(st);
		
		st.append(" Here");//Add in last
		
		System.out.println(st);

	}

}
