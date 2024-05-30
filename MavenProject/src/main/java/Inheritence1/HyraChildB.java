package Inheritence1;

public class HyraChildB extends HyraParaA{
	

	
		
		public void  showHyBMain()
		{
			System.out.println("In Show B");
		}


	public static void main(String[] args) {
		
		HyraChildB  obj=new HyraChildB();
		HyraChildA obj1=new HyraChildA();
		
		obj.showHyBMain();
		obj.showHyA();
		obj1.showHyBChild();
		obj1.showHyA();

	}

}
