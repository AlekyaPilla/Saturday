package methods;

public class MethodEx1 {
	
	void m1() //instance method--- method declaration
	{
		System.out.println("m1 instance method"); //--- method implementation
	}
	
	static void m2() //static method
	{
		System.out.println("m2 static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx1 me1= new MethodEx1();
		me1.m1(); //method calling
		MethodEx1.m2();
		

	}

}
