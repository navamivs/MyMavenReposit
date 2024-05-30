package Aggregation;

class  V
{
	static int k;
	
	public V(int k)
	{
		V.k=k;
		
		
	}
	void x()
	{
		System.out.println(k);
	}
	
}




public class ThisTest {

	public static void main(String[] args) {
		V obj=new V(88);
		V obj1=new V(898);
		obj.x();

	}

}
