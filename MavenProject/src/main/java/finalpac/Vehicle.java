package finalpac;

public class Vehicle extends VehiclePar{
	
	public void bus()
	{
		System.out.println("In Arriva");
		}

	public static void main(String[] args)
	{
		
		Vehicle obj =new Vehicle();
		obj.bus();
		obj.car();
		}

}
