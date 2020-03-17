package InterViewQuestion;

import java.util.*;

class MapSortUsingKey2 {
	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(34, "dhiraj");
		map.put(23, "manish");
		map.put(12, "ramesh");
		map.put(22, "vivek");
		map.put(11, "ravi");

		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry mapentry = (Map.Entry) it.next();
			System.out.println(mapentry.getKey()+" "+mapentry.getValue());
		
		}
		Map map1 = new TreeMap(map);
		Set set1 = map1.entrySet();
		Iterator it1 = set1.iterator();
		while (it1.hasNext()) {
			Map.Entry mapentry1 = (Map.Entry) it1.next();
			System.out.println(mapentry1.getKey());
		}
	}
}