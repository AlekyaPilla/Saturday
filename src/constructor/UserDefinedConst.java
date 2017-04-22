package constructor;

public class UserDefinedConst {
	
	void m1()
	{
		System.out.println("m1 method");
	}
	
	UserDefinedConst()
	{
		System.out.println("0 arg constructor");
	}
	
	UserDefinedConst(int a)
	{
		System.out.println("1 arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefinedConst udc = new UserDefinedConst();
		UserDefinedConst udc1 = new UserDefinedConst(55);

		udc.m1();
		udc1.m1();

	}

}
