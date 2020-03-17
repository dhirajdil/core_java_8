package InterViewQuestion;

import java.util.*;

public class ListSort {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Dhiraj");
		list.add("Manish");
		list.add("Ramesh");
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");

		Collections.sort(list);
		System.out.println(list);
	}

}
