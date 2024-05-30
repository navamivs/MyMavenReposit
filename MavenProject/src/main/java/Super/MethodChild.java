package Super;

public class MethodChild extends MethodPar {
	 public void show()
	 {
		 super.show();
		 System.out.println("In Child");
		 }


	public static void main(String[] args) {
		
		MethodChild obj=new MethodChild();
		obj.show();		
	}

}
