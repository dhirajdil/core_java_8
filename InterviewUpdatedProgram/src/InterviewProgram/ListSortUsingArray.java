package InterviewProgram;

import java.util.*;

public class ListSortUsingArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Dhiraj");
		list.add("manish");
		list.add("ravi");
		list.add("ramesh");
		list.add("vivek");

		String[] name = list.toArray(new String[list.size()]);
		int len = name.length;
		System.out.println(len);
		for (int i = 0; i <= len; i++) {
			for (int j = i + 1; j <=len; j++) {
				String st1 = name[i];
				String st2 = name[j];
				int idx = st1.compareTo(st2);
				if (idx > 0) {
					name[i] = st2;
					name[j] = st1;
				}
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.println(name[i]);
		}

	}

}
