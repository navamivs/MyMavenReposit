package OverRidding;

public class ChildA extends ParentA{
	

	public void show()
	{
		System.out.println("In Child Show");
	}

	public static void main(String[] args) {
		
		ChildA obj=new ChildA();
		obj.show();
		
	}

}
