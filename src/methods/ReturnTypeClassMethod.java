package methods;

public class ReturnTypeClassMethod {
	
	ReturnTypeClassMethod rtcm()
	{
		return this; // return current class
	}
	
	Emp e() //
	{
		Emp e= new Emp();
		return e;
		
	}
	
	Student s()
	{
		Student s= new Student();
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReturnTypeClassMethod rt = new ReturnTypeClassMethod();
		ReturnTypeClassMethod z= rt.rtcm(); // holding return value of current class
		Emp x= rt.e();
		Student y= rt.s();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);



	}

}
