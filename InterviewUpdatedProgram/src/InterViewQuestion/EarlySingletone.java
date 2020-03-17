package InterViewQuestion;

import java.util.*;

public class EarlySingletone {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("z");
		list.add("c");
		list.add("x");
		list.add("n");
		list.add("s");

		char[] c = list.toArray(new char[list.size()]);
	}
}
