package interfacepac;

public class HwChildMain implements HwPar {
public void showParent() {
		
		System.out.println("HWChild2 Show");
		
	}
	public static void main(String[] args) {
		
		HwChildMain obj=new HwChildMain();
		obj.showParent();
		
		HwPar obj1=new HwChildMain();//Upcast
		obj1.showParent();
		

	}

}
