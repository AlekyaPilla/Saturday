package variables;

public class TestStaticVar {

		static int a=10; //static variable
		int b=20; //instance variable
		public static void main(String[] args) //static method
		{
			TestStaticVar TSV = new TestStaticVar();//creating an object for class
			TSV.m1(); //calling instance method using object
			System.out.println(TestStaticVar.a); //static area-- accessing static variable using class name
			System.out.println(TSV.b); //static area-- accessing instance variable using object


		}

		void m1() //instance method
		{
			System.out.println(b); //instance area - instance variable is accessed directly
			System.out.println(TestStaticVar.a); //instance area--accessing static variable using class name
			
		}
	
}

