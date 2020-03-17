
package InterviewProgram;

import java.lang.ref.WeakReference;
import java.util.*;

public class MergeTwoArray {
	public static void main(String[] args) {
		String a[] = { "A", "B", "C" };
		String b[] = { "0", "U" };
		Arrays.asList(a);
		List list = new ArrayList(Arrays.asList(a));// convert array to list
		System.out.println(list);
		list.addAll(Arrays.asList(b));

		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));

		int d[] = { 1, 2, 3, 5, 6 };
		int e[] = { 2, 4, 5, 7 };

	}

}
