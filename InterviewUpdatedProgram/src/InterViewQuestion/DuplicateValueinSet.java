package InterViewQuestion;

import java.util.*;

public class DuplicateValueinSet {
	public static void main(String[] args) {
		Pilla pi = new Pilla(99);
		Set set = new HashSet();
		set.add(set);
		set.add(set);
		set.add(set);
		System.out.println(set);

	}

}

class Pilla {
	int sid;

	Pilla(int sid) {
		this.sid = sid;
	}

	public String toString() {
		return "" + sid;
	}
}
