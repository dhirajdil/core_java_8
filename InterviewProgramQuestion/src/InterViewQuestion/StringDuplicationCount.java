package InterViewQuestion;

import java.util.*;

public class StringDuplicationCount {
	public static void main(String[] args) {
		String str = "string as input as string string strin";
		String split[] = str.split(" ");
		int f = 0;
		int i;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (i = 0; i < split.length; i++) {
			if (map.containsKey(split[i])) {
				map.put(split[i], map.get(split[i]) + 1);

			} else {
				map.put(split[i], 1);
			}
		}
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			Map.Entry entry = (Map.Entry) obj;
			Integer value = (Integer) entry.getValue();
			if (value > 1) {
				System.out.println(entry.getKey() + "\t" + entry.getValue());
			}

		}

	}

}
