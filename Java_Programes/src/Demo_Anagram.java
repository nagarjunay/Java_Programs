import java.util.Arrays;

/**
 * 
 */

/**
 * @author nagarjuna
 *
 */
public class Demo_Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str = "nagarjuna";
		String str1 = "aunjragan";
		System.out.println("Both strings are anagram: "+  anagramcheck(str, str1));
		
	}
	
	public static boolean anagramcheck(String str, String str1) {
		
		char[] stringarray1 = str.toCharArray();
		char[] stringarray2 = str1.toCharArray();
		Arrays.sort(stringarray1);
		Arrays.sort(stringarray2);
		
		return Arrays.equals(stringarray1, stringarray2);
		
	}

}
