package methods;

class Emp{}
class Student{}

public class VoidMethodObjectParam {
	
	void m1(Emp e) //method declaration with objects as parameter
	{
		System.out.println("m1 method"); //method implementation
	}
	
	static void m2(Student s) //method declaration with objects as parameter
	{
		System.out.println("m2 method"); //method implementation
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoidMethodObjectParam vmop= new VoidMethodObjectParam();
		Emp e1= new Emp();
		vmop.m1(e1);  //method calling with object as parameter
		
		Student s1= new Student();
		VoidMethodObjectParam.m2(s1);
		

	}

}
