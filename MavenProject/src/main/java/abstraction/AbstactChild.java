package abstraction;

public class AbstactChild extends AbstractPar {
	
	public void run()
	{
		System.out.println("Running......");	}

	public static void main(String[] args) {
		

		AbstactChild obj =new AbstactChild();
		obj.run();
		obj.walk();
		
	}

}
