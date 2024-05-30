package Overloading;

public class OverLoad {
	
	public void add() {
		System.out.println("In Add");
	}
	
	
	public void add(int a)
	{
		System.out.println("In Add " +a);
	}
	
	

	public static void main(String[] args) {
		OverLoad obj=new OverLoad();
		obj.add();
		obj.add(7);
		

	}

}
