package Practice;

import java.util.*;


public class Lab33 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("0");
		list.add("1");
		list.add("22");
		list.add("11");
		list.add("2");
		
		Collections.sort(list);
		System.out.println(list);
	}

}
