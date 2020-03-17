package DailyPractice;

import java.util.*;



public class Test22 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("dhiraj");
		list.add("manish");
		list.add("dhiraj");
		
		System.out.println(list);
		
		Set set=new HashSet(list);
		set.add("patna");
		set.add("gaya");
		
		System.out.println(set);
		
		
	}
}
