package Practice;

import java.util.*;

public class Lab18 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("dhiraj");
		list.add("manish");
		list.add("vivek");
		list.add("ramesh");
		System.out.println(list);
		ListIterator lit=list.listIterator();
		while(lit.hasNext()){
			Object obj=lit.next();
			if(obj.equals("vivek"))
			lit.add("masaurhi");
			if(obj.equals("ramesh"))
				lit.remove();
		}
		System.out.println(list);
	}
}
