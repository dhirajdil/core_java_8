package DailyPractice;

import java.util.*;
public class Test12 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("ajay");
		list.add("vijay");
		list.add("dhiraj");
		list.add("bihar");
		list.add("patna");
		list.add("masaurhi");
		list.add("gaya");
		
		System.out.println(list);
		ListIterator lit=list.listIterator();
		while(lit.hasNext()){
			Object obj=lit.next();
			System.out.println(obj);
			if(obj.equals("ajay")){
				lit.remove();
			}else if(obj.equals("vijay")){
				lit.set("xyz");
			}else if(obj.equals("patna")){
				lit.add("pvr");
			}else if(obj.equals("xyz")){
				lit.set("mvc");
			}
			System.out.println(list);
		}
	}

}
