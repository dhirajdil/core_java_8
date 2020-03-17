package InterviewProgram;

import java.util.*;

public class EarlySingletone {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("z");
		list.add("c");
		list.add("x");
		list.add("n");
		list.add("s");

		Object[] c = list.toArray(new Object[list.size()]);
	}
}
