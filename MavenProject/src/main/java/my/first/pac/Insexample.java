package my.first.pac;

public class Insexample {
	
	
public void abc(int a)
{
	
	System.out.println("Value in instance method " +a);
}

public int efg()
{
	int a=5;
	int b=4;

	
	return a+b;
}

	public static void main(String[] args) {
		
		Insexample obj=new Insexample();
		obj.abc(5);
		int k;
		k=obj.efg();
		System.out.println(k);
		
		
		
		
		
		
		
	}

}
