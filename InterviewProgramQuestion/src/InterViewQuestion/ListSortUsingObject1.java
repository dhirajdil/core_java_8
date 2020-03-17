package InterViewQuestion;

import java.util.*;

public class ListSortUsingObject1 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(new Man(10));
		list.add(new Man(9));
		list.add(new Man(12));
		list.add(new Man(15));
		list.add(new Man(4));
	}

}

class Man implements Comparable {
	int sid;

	Man(int sid) {
		this.sid = sid;
	}

	public int CompareTo(Object obj) {
		if (obj instanceof Man) {
			Man mn = (Man) obj;
			return this.sid - mn.sid;
		}
		return 0;
	}

	public String toString() {
		return "" + sid;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
