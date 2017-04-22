package methods;

public class ReturnTypeMethod {

	int m1(char a) // instance method declaration with parameters
	{
		System.out.println("method m1 value:"+a);
		return 10; // return because it is non-void method
	}
	
	int m1(int n) // instance method declaration with no parameters
	{
		
		System.out.println("method m1 value:"+n);
		return 50; // return because it is non-void method
	}

	static float m2(int b) // static method declaration with parameters
	{
		System.out.println("method m2 value:"+b);
		return 10.5f; // return because it is non-void method
	}
	
	static float m2(String s) // static method declaration with parameters
	{
		System.out.println("method m2 value:"+s);
		return 20.5f; // return because it is non-void method
	}
	
	public static void main(String[] args) 
	{
		ReturnTypeMethod rtm= new ReturnTypeMethod(); // object creation
		int x=rtm.m1('m'); //calling method m1 and holding the return value		
		int y=rtm.m1(1); //calling method m1 and holding the return value
		
		System.out.println("m1 method return value: "+x);
		System.out.println("m1 method return value: "+y); 

		float f1=ReturnTypeMethod.m2(30); //calling method m2 and holding the return value
		float f2=ReturnTypeMethod.m2("ratan"); //calling method m2 and holding the return value

		System.out.println("m1 method return value: "+f1);
		System.out.println("m1 method return value: "+f2);


	}
}