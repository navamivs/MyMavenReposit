package Annotation;

@FunctionalInterface
interface X
{
	void sam();
	
}


class A
{
	public void showTheDataInClass()
	{
		System.out.println("In A show");
	
	}
}

class B extends A
{
	@Override
	public void showTheDataInClass()
	{
		System.out.println("In B show");
	
	}
}

public class Eg {

	public static void main(String[] args) {
	B obj=new B();
	obj.showTheDataInClass();
	
	X obj1=new X()
			{
		public void sam()
		{
			System.out.println("In main");
		}
			};

			obj1.sam();
	}

}
