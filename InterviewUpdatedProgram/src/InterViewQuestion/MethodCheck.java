package InterViewQuestion;

import java.util.*;

public class MethodCheck {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("dhiraj");
		list.add("dhiraj");
		list.add("manish");
		list.add("masaurhi");
		list.add("patna");

		int len = list.size();
		for (int i = 1; i < len; i++) {
			String name1 = (String) list.get(i);
			String name2 = (String) list.get(i - 1);
			System.out.println(name1);
		}
	}

}
