package methods;

//class Emp{}

public class DiffMethodSignature {
	
	void m1()
	{
	System.out.println("method m1 with no parameter");
	}
	
	static void m1(Emp e)
	{
	System.out.println("method m1 with object as parameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffMethodSignature dms= new DiffMethodSignature();
		dms.m1();
		
		Emp e= new Emp();
		DiffMethodSignature.m1(e);
		
	}

}
