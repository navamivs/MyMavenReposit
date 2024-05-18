package Annotation;


interface XX
{
	void sam();
	
}

interface Y
{
	void sam(int i);
	
	
}


interface D
{
	
	int ec(int u);
}

interface S
{
	void ex();
}

public class LamdaEx {

	public static void main(String[] args) {
	
	 
	XX obj1=() ->System.out.println("In main");
		
			obj1.sam();
			
	Y obj=(int k) -> System.out.println(k);
			
		
		obj.sam(7);
		
		
		
		D obj2=(int y) -> y;	
		
		
		System.out.println(obj2.ec(97));
				
		
		S obj3=() ->

		{
				System.out.println("k");
				System.out.println("u");
			
		};
			
				
		
				
				obj3.ex();
			
	}

}
