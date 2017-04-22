package methods;

public class VoidMethodParam {
	
	void m1(char c, int a) //instance method--- method declaration with parameters (local variables)
	{
		System.out.println("m1 instance method"); //--- method implementation
		System.out.println(c); //--- method implementation
		System.out.println(a); //--- method implementation

	}
	
	static void m2(String s, float f) //static method--- method declaration with parameters (local variables)
	{
		System.out.println("m2 static method");
		System.out.println(s); //--- method implementation
		System.out.println(f); //--- method implementation

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethodParam vmp= new VoidMethodParam();
		vmp.m1('a', 10); //method calling with parameters
		VoidMethodParam.m2("Alekya",35);
		

	}

}
