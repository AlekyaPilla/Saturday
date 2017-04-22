package variables;

public class VarAssign2 {
	
	int a=10;//instance variable
	int b=20;//instance variable
	static int x=5;//static variable
	static int y=15;//static variable
	
	void m1() //instance method
	{		
		System.out.println(a); //instance area-- accessing instance variable directly
		System.out.println(b); //instance area-- accessing instance variable directly
		System.out.println(VarAssign2.x); //instance area-- accessing static variable using class name
		System.out.println(VarAssign2.y); //instance area-- accessing static variable using class name

	}
	

	static void m2() //static method
	{
		VarAssign2 VA2= new VarAssign2(); //object creation for class
		System.out.println(VA2.a); //static area-- accessing instance variable using object
		System.out.println(VA2.b); //static area-- accessing instance variable using object
		System.out.println(VarAssign2.x); //instance area-- accessing static variable using class name
		System.out.println(VarAssign2.y); //instance area-- accessing static variable using class name
	}
	
	
	public static void main(String[] args) {
		
		VarAssign2 VA2= new VarAssign2();
		VA2.m1();//calling static method using class name
		VarAssign2.m2();//calling static method using class name
	
	}

}
