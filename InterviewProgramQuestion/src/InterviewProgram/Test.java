package InterviewProgram;

//Program for Sorting map using key value

import java.util.*;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {

		System.out.println(new SriRamesh().toString());
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, " Dhiraj");
		map.put(23, "vivek");
		map.put(24, "0ramesh");
		map.put(34, "ravi");
		map.put(56, "ghanshyam");

		Set set = map.entrySet();
		// System.out.println(set);
		String sortedStr[] = new String[map.size()];
		int i = 0;
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object ob = it.next();
			String st = ob.toString();
			String st1[] = st.split("=");
			sortedStr[i] = st1[1] + "=" + st1[0];
			i++;

		}
		Arrays.sort(sortedStr);
		for (String s : sortedStr) {
			String stt[] = new String[2];
			stt = s.split("=");
			System.out.println(stt[1] + "\t" + stt[0]);
		}

	}

}

class SriRamesh {
	int age = 27;
	String name = "Babu Ramesh";

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age + "\t" + name;
	}
}