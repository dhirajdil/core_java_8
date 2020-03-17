package comPractice;

import java.util.Map.Entry;
import java.util.*;

public class Lab4 {
	public static void main(String[] args) {
		String a[]={"dhiraj","manish","vivek","vivek","vivek","vivek","ramesh","neeraj","dhiraj","ramesh","dhiraj"};
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
		Set<Entry<String, Integer>> set=map.entrySet();
		List<Entry<String, Integer>> list=new ArrayList<Map.Entry<String,Integer>>(set);
		Collections.sort(list,new Comparator<Map.Entry<String , Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o1.getValue().compareTo(o2.getValue()));
			}
		});
		for(Map.Entry<String, Integer> entry:list) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
			
	}

}
