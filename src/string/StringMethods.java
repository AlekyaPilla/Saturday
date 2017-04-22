package string;

public class StringMethods {

	public static void main(String[] args) {

		String str1= "Working on strings";
		String str2= "";
		String str3= "   trim the line   ";
		String str4= "replaced";
		String str5= "HELLO";
		
		//length of the string
		System.out.println(str1.length());
		
		//charAt
		System.out.println(str1.charAt(4));
		
		//concat
		System.out.println(str1.concat(" confused!"));
		
		//contains
		System.out.println(str1.contains("o"));
		
		//startsWith
		System.out.println(str1.startsWith("Wor"));
		
		//endswith
		System.out.println(str1.endsWith("Str"));
		
		//equals
		System.out.println(str1.equals("Working on Strings"));
		
		//indexOf
		System.out.println(str1.indexOf("s"));
		
		//isEmpty
		System.out.println(str2.isEmpty());
		
		//replace
		System.out.println(str4.replace('e','i'));
		
		//substring
		System.out.println(str1.substring(1,5));
		
		//toCharArray
		char[] charArray= str4.toCharArray();
		for(int i=0; i<charArray.length; i++)
		{
		System.out.println(charArray[i]);
		}
		
		//toLowerCase
		System.out.println(str5.toLowerCase());

		//toUpperCase
		System.out.println(str4.toUpperCase());
		
		//trim
		System.out.println(str3.trim());


	}

	
}
