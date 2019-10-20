/**
 * 
 */

/**
 * @author nagar
 *
 */
public class StringMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "Hello World";
		String str1 = "Hello world";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println(str.indexOf("o"));
		System.out.println();
		
		System.out.println(str.indexOf("o", 0));
		System.out.println();
		
		System.out.println(str.indexOf("l", str.indexOf('l')+1));
		System.out.println();
		
		System.out.println(str.length());
		System.out.println();
		
		System.out.println(str.indexOf("World"));
		System.out.println();
		
		System.out.println(str.equals(str1));
		System.out.println();
		
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println();
		
		System.out.println(str.substring(0, 9));
		System.out.println();
		
		/* To Remove spaces will use replaceAll() method*/
		String s= "  Adventures tour  ";
		s = s.replaceAll(" ", "");
		System.out.println(s);
		System.out.println();
		
		/* To Remove underscore will use split() method*/
		String test = "Hello_Selenium_Testing";
		String testvar[] = test.split("_");
		for(int i=0; i<testvar.length; i++) {
			System.out.println(testvar[i]);
		}
		System.out.println();
		
		/* To join to strings will use concat() method*/
		String s1 = "I am a manual" ;
		System.out.println(s1.concat(" tester"));
		System.out.println();
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b= 200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
	
		
		
		
	}

}
