package Inheritence1;

public class MultilevelBase  extends MultiB{

	public void showMultiMain()
	
	{
		System.out.println("In MultiMain");
	}



	
	public static void main(String[] args) {
	
		MultilevelBase obj= new MultilevelBase();
		obj.showMultiMain();
		obj.showMultiA();
		obj.showMultiB();
		
		
		

	}

}
