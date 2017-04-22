package methods;

public class ReturnUsingThis {
	
	int x=10;
	
	char ch='a';
	
	 int m1(int x) //instance method--- method declaration
	{   
		return x;
	}
	 
	 int m2(int x) //instance method--- method declaration
		{   
			return this.x;
		}
	
	char m3(char ch) //instance method
	{
		return ch;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnUsingThis rut = new ReturnUsingThis();
		int l= rut.m1(100);
		int m= rut.m2(100);
		char c= rut.m3('p');
		
		System.out.println("method m1:"+l);
		System.out.println("method m1:"+m);
		System.out.println("method m1:"+c);

		

	}

}
