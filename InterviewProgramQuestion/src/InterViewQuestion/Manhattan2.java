package InterViewQuestion;

import java.util.*;
import java.util.Map.Entry;

public class Manhattan2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "ravi chotala");
		map.put(2, "mohan");
		map.put(9, "sri ramesh");
		map.put(4, "");
		map.put(5, "dev");
		map.put(6, "ash");
		map.put(8, "hero");
		map.put(3, "vicky");
		map.put(10, "ravddd");
		Set set1 = map.entrySet();
		Iterator it = set1.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			Map.Entry<Integer, String> entry = (Map.Entry) ob;
			int i = entry.getKey();
			if (i % 2 != 0) {
				System.out.println("key is" + i + "and value is"
						+ entry.getValue());
			}
		}

	}

}
