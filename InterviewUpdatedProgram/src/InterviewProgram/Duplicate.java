package InterviewProgram;

import java.util.*;

public class Duplicate {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Dhiraj");
		list.add("Manish");
		list.add("Manish");
		list.add("Ramesh");
		list.add("Ramesh");
		list.add("Vivek");
		list.add("Dhiraj");
		

		int len = list.size();
		for (int i = 1; i<len-1; i++) {
			String name1 = list.get(i);
			String name2 = list.get(i-1);
			if (name1.equals(name2)) {
				list.remove(i);
				
			}
	
		}
		System.out.println(list);
	}

}
