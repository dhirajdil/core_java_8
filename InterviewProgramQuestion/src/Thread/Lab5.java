package Thread;

import java.util.*;

public class Lab5 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("dhiraj");
		list.add("manish");
		list.add("bihar");
		list.add("patna");
		
		ListIterator it=list.listIterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
			if(obj.equals("bihar")) {
//				list.add("hometown");
			}
			System.out.println(list);
		}
		
//		Set list=new HashSet();
//		list.add("patna");
//		list.add("bihar");
//		list.add("manish");
//		list.add("dhiraj");
//		
//		Iterator it=list.iterator();
//		while(it.hasNext()) {
//			Object obj=it.next();
//			list.add("susta");
//		}
	}

}
