/**
 * 
 */

/**
 * @author nagar
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello World";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("*************************************************");
		System.out.println(str.indexOf("o"));
		System.out.println("*************************************************");
		System.out.println(str.indexOf("o", 0));
		System.out.println("*************************************************");
		System.out.println(str.indexOf("l", str.indexOf('l')+1));
		System.out.println("*************************************************");
		System.out.println(str.length());
		System.out.println("*************************************************");
		
		/*str = str.replaceAll("\\s", "");
		System.out.println(str);
		System.out.println("*************************************************");*/
		
	}

}
