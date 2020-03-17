package InterviewProgram;

import java.util.*;
import java.util.Map;
import java.util.WeakHashMap;

public class DuplicateKeyInMap {

	public static void main(String[] args) {
		// Example of IdentityMap
		Map<Integer, String> map = new IdentityHashMap<Integer,String>();
		map.put(new Integer(10), "Dhiraj babu");
		map.put(new Integer(10), "Niraj babu");
		map.put(new Integer(10), "Manish babu");
		//System.out.println(map);

		// Example of WeakHashMap

		System.out.println(map);

	}

}
