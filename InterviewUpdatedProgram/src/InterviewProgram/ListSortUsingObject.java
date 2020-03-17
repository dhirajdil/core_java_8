package InterviewProgram;

import java.util.*;

public class ListSortUsingObject {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Employee(10, "zhiraj"));
		list.add(new Employee(30, "manish"));
		list.add(new Employee(40, "ramesh"));
		list.add(new Employee(50, "Sri"));
		list.add(new Employee(80, "Nivas"));
		System.out.println(list);
			
		Collections.sort(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Employee implements Comparable {
	int sid;
	String name;

	Employee(int sid, String name) {
		this.name = name;
		this.sid = sid;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Employee) {
			Employee st = (Employee) obj;
			return this.name.compareTo(st.name);
		}
		return 0;
	}

	public String toString() {
		return sid + "\t" + name;
	}

}
