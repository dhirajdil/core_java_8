package InterviewProgram;

import java.util.*;

public class MapSortUsingKey {
	public static void main(String[] args) {
		Map map = new HashMap<>();
		map.put(10, "Dhiraj");
		map.put(12, "manish");
		map.put(23, "Ramesh");
		map.put(45, "ghanshyam");
		map.put(56, "masaurhi");
		System.out.println(map);
		
		
		
		Map<Integer, String> map1 = new TreeMap<Integer, String>(map);
		System.out.println(map1);
		
	}
}
