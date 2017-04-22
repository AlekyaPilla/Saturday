package variables;

public class StaticVsInstance 
{
	int a=10;
	static int b=20;
	public static void main(String[] args) 
	{
		StaticVsInstance SI= new StaticVsInstance();
		System.out.println(SI.a); //10
		System.out.println(SI.b); //20 -- static variables can also be accessed using objects but not recommended

		SI.a= 100;
		SI.b= 200;
		System.out.println(SI.a); //100
		System.out.println(SI.b); //200

		StaticVsInstance SVI= new StaticVsInstance();
		System.out.println(SVI.a); //10
		System.out.println(SVI.b); //200-- because memory is created only once for all objects

	}
}
