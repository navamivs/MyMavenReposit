package Super;

public class SuperVariableChild extends SuperVariable{

	String s="VS";
	
	public void show()
	{
		System.out.println(super.s);
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
	
		SuperVariableChild obj=new SuperVariableChild();
		obj.show();		

	}

}
