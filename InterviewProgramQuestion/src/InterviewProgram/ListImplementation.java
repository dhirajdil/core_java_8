package InterviewProgram;

import java.util.*;

public class ListImplementation {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Dhiraj");
		list.add("manish");
		list.add("bihar");
		list.add("vivek");
		list.add("ravi");
		list.add("ramesh");

		list.add(5, "element 0");

		System.out.println(list);

	}

}
