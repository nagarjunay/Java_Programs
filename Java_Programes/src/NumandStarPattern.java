import java.util.Scanner;

/**
 * 
 */

/**
 * @author nagar
 *
 */
public class NumandStarPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int row = scan.nextInt();
		
		for(int i=1; i<=row; i++) {
			System.out.println("");
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		System.out.print("**********************************");
		
		for(int i=1; i<=row; i++) {
			System.out.println("");
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
		}
		
	}

}
