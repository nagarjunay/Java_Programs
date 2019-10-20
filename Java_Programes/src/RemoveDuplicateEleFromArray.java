import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 
 */

/**
 * @author nagar
 *
 */
public class RemoveDuplicateEleFromArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		int a[] = { 10, 10, 10, 20, 20, 20, 30, 30, 40, 40 };
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (set.add(a[i]) == true) {
				st.add(a[i]);
			}

		}
		System.out.println(st);

	}

}
