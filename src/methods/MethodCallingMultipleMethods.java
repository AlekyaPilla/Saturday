package methods;

public class MethodCallingMultipleMethods {

	void m1()
	{
		m3(10);
		m2();
	System.out.println("method m1 ");
	}
	
	void m2()
	{
		System.out.println("method m2");
		m3(10);
	}
	
	static void m3(int a)
	{
	System.out.println("method m3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCallingMultipleMethods mcmm= new MethodCallingMultipleMethods();
		mcmm.m1();
		
		
	}

}

