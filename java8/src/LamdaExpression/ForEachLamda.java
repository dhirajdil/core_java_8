package LamdaExpression;

import java.util.*;

public class ForEachLamda {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hyderabad");
		list.add("pune");
		list.add("bangalore");
		list.add("delhi");
		list.add("kolhapur");
		
		//System.out.println(list);
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		
		
		list.forEach(
				(n)->System.out.println(n));
		
	}

}
