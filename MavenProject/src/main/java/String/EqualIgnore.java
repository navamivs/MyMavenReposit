package String;

public class EqualIgnore {

	public static void main(String[] args) {
		
		String s1="Java";
		String s2="Java";
		String s3="java";
		String s4="Python";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		
	}

}
