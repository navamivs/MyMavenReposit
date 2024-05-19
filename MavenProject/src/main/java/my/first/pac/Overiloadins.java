package my.first.pac;
class Test1
{
public int abc(int a,int b)//Instance Method overloading
{
	return a+b;
}

public float abc(float a,int b)
{
	return a+b;
}

}
public class Overiloadins {

	public static void main(String[] args) {
		
Test1 obj=new Test1();
int x=obj.abc(1, 2);
float y=obj.abc(10.9f, 2);

System.out.println("First Method " +x);

System.out.println("Second Method " +y);

		
		
	}

}
