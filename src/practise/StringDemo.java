package practise;

public class StringDemo {

	public static void main(String[] args) {
		
		// string literal - string constant pool
		String s1= "Java";
		String s3= "Java";
		s1= "More Java";
		
		// string object - heap memory
		String s2= new String("Practice");
		String s4= new String(" Practice");
		
		String stradd= s1+s4;
		System.out.println(s1+s4);		
		
		
	}

}
