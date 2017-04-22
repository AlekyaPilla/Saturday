package variables;

public class VarAssign1 {
	
	int a=10;//instance variable
	int b=20;//instance variable
	
	static void m1() //static method
	{
		VarAssign1 VA1= new VarAssign1(); //object creation for class
		
		System.out.println(VA1.a); //static area-- accessing instance variable using object
		System.out.println(VA1.b); //static area-- accessing instance variable using object
	}
	
	void m2() //instance method
	{		  
		System.out.println(b); //instance area-- accessing instance variable directly
		System.out.println(a); //instance area-- accessing instance variable directly		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarAssign1.m1();//calling static method using class name
		
		VarAssign1 VA2= new VarAssign1();
		VA2.m2();//calling static method using class name
	
	}

}
