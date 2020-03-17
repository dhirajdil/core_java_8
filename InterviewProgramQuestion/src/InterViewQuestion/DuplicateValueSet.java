package InterViewQuestion;

import java.util.*;

public class DuplicateValueSet {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		set.add(new Student(99));
		System.out.println(set);
	}

}

class Student {
	int sid;

	Student(int sid) {
		this.sid = sid;
	}

	public int equal() {
		return sid;
	}

	public int hashcode(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student) obj;
			return this.sid = st.sid;
		}
		return false;

	}

	public String toString() {
		return "" + sid;
	}

}
