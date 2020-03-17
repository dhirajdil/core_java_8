package DailyPractice;

import java.util.*;

public class Test20 {
	public static void main(String[] args) {
		List list1=new ArrayList<>();
		list1.add("dhiraj");
		list1.add("kumar");
		list1.add("bihar");
		List list2=new ArrayList();
		list2.add("vivek");
		list2.add("kumar");
		list2.add("gya");
		
		for(int i=0;i<list1.size();i++){
			for(int j=i;j<list2.size();j++){
				System.out.println(list1.get(i));
				System.out.println(list2.get(j));
				break;
			}
		}
	}

}
