package abstraction;

public class Drivechild2 extends DriveParant {

	public void music()
	{
		System.out.println("Music in Child main");
	}
	
	public void dance()
	{
		System.out.println("Dance main");
	}
	
	
	public static void main(String[] args) {
		
		DriveParant  obj=new Drivechild2();//upcasting
		obj.music()	;	
			
		Drivechild2 ob=(Drivechild2) obj;//downcast
		ob.dance();
		
		DriveParant  obj2=new DriveChild1();
		obj2.music();
		
		DriveChild1 ob3=(DriveChild1) obj2;//downcast
		ob3.jump();

	}

}
