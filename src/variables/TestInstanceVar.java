package variables;

//instance variable declaration, scope, memory allocation

public class TestInstanceVar {

	//instance variable
		int a=10; 
		int b=20;
		public static void main(String[] args) //static method
		{
			TestInstanceVar TIV = new TestInstanceVar();
			System.out.println(TIV.a); //static area
			System.out.println(TIV.b); //static area
			TIV.m1();


		}

		void m1() //instance method
		{
			System.out.println(b); //instance area
			System.out.println(a);
		}

}
