package InterViewQuestion;

import java.util.*;

public class ManHattan3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("india");
		list.add("south");
		list.add("india");
		list.add("south");
		list.add("aust");
		list.add("south");
		Set<String> set = new HashSet<String>(list);
		set.addAll(list);
		System.out.println(set);

	}

}