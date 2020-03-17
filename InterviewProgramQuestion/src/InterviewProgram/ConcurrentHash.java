package InterviewProgram;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHash {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<Integer, String>();
		map.put(1, "ravi");
		map.put(2, "r");
		map.put(3, "mohan");
		map.put(4, "sures");
		map.put(5, "don");
		map.put(6, "dheera");
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) obj;
			System.out.println(entry.getKey() + "\t" + entry.getValue());
			map.put(9, "suresh");
		}

	}

}
