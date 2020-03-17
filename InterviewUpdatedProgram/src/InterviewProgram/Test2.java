package InterviewProgram;

//Program for array length without using .length

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String str = "dhiraj";
		int count = 0;
		char[] c = str.toCharArray();
		for (char t : str.toCharArray()) {
			count++;
		}
		System.out.println(count);
		List<String> list = new ArrayList<String>();
		list.add("dhiraj");
		list.add("10");
		list.add("bihar");
		list.add("patna");
		int count1 = 0;
		for (String l : list) {
			count1++;
		}
		System.out.println(count1);
	}

}
