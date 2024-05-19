package my.first.pac;
class Room

{
	int climate=23;
	public void computer()//instance non access modifier no need to specify
	{
		System.out.println(" Music Playing");
	}
	public static void tv()//Static non access modifier
	{
		System.out.println(" Movie Playing");
	}
		public String ac(int a)
		{
			
			if(a>=31)
			{
				System.out.println("Ac On");
				System.out.println("Climate declared on class"+climate);
				return "AcWorking";
			}
	
					return "Acoff";
			
		}
}

public class Exmethodpgm1
{

	public static void main(String[] args)
	{
		int tem=41;
		String r;
		Room obj=new Room();
		obj.computer();
		Room.tv();
		r=obj.ac(tem);
		System.out.println("Return value is "+r);

	}

}
