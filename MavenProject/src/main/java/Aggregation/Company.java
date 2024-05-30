package Aggregation;

public class Company {

	String cname,cplace;
	Personal p;
	public  Company(String cname,String cplace,Personal p)
	{
		this.cname=cname;
		this.cplace=cplace;
		this.p=p;
	}
	
	void getDetails()
	{
		System.out.println(cname+ " :"+cplace);
		System.out.println(p.name+": "+p.age+" :"+p.salary );
		
	}
	
	
	public static void main(String[] args) {
		Personal obj=new Personal("Madhav",30,1500);
		Company obj1=new Company("UST","TVM",obj);
		
		obj1.getDetails();
				}

}
