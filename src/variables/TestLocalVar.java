package variables;

public class TestLocalVar {

	public static void main(String[] args) { // memory is allocated when method starts
		// TODO Auto-generated method stub
		int a=10; // local variables
		int b=20;
		System.out.println(a+b);

	} //memory is released when method ends

	//when instance method is created and trying to access local variable
	 //local variable is out of scope but it will still
	//execute because execution starts from main method
}
