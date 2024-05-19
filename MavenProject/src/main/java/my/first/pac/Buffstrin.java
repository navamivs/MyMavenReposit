package my.first.pac;

public class Buffstrin {

	public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("Navami");
		System.out.println(sb.capacity());//total size of string buffer
		System.out.println(sb.length())	;//length of sring	
		sb.append("vs ");
		System.out.println(sb);
		sb.setLength(70);
		System.out.println(sb.capacity());
		sb.insert(6 , "java");//after 6th char java will be inserted
		System.out.println(sb);
		//String s=sb.toString();//changing the datatype  buffer string to string
		System.out.println(sb);
		
	}

}
