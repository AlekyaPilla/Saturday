
package methods;

public class ThisKeywordUsage {
	
	int x=10;
	int y=20;
	
	static void m1() //instance method--- method declaration
	{   int a=30;
		int b=40;
		System.out.println(a+b); //--- method implementation ---local variables
		ThisKeywordUsage tku= new ThisKeywordUsage();
		System.out.println(tku.x+tku.y); //--- method implementation ---instance variables

	}
	
	void m2() //static method
	{
		int x=50;
		int y=60;
		System.out.println(x+y); //--- method implementation ---local variables
		System.out.println(this.x+this.y); //--- method implementation ---instance variables

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordUsage tku1= new ThisKeywordUsage();
		tku1.m2(); //method calling
		ThisKeywordUsage.m1();
		

	}

}
