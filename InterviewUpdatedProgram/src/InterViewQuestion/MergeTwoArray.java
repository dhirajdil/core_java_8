package InterViewQuestion;

import java.lang.ref.WeakReference;
import java.util.*;

public class MergeTwoArray {
	public static void main(String[] args) {
		String a[] = { "A", "B", "C" };
		String b[] = { "0", "U" };
		Arrays.asList(a);
		List list = new ArrayList(Arrays.asList(a));
		// convert array to list
        System.out.println(list);
		list.addAll(Arrays.asList(b));
		System.out.println(list);
		
		Object obj[]=list.toArray();
		int len=obj.length;
		for(int i=0;i<len;i++) {
			System.out.println(obj[i]);
		}

//		Object[] c = list.toArray();
//		System.out.println(Arrays.toString(c));
//
//		int d[] = { 1, 2, 3, 5, 6 };
//		int e[] = { 2, 4, 5, 7 };
//		List list1=Arrays.asList(a);
//		System.out.println(list1);
//		List list2=Arrays.asList(b);
//		list1.addAll(list2);
//		
//		System.out.println(list2);
	
		
		
		

	}

}
