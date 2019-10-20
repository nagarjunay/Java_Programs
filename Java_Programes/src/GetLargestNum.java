/**
 * 
 */

/**
 * @author nagar
 *
 */
public class GetLargestNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {110,29,230,56};
		System.out.println("2nd largest number is :" + getLargestnum(a, 4));

	}

	public static int getLargestnum(int a[], int total) {
		int temp;
		for(int i=0; i<total; i++) {
			for(int j=i+1; j<total; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		
		
		return a[total-2];
		
	}
	
	
}
