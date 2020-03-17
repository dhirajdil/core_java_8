package InterViewQuestion;

import java.util.*;
public class MapSortingUsingValue {
	public static void main(String[] args) {
		Map<Integer,String> hmap=new HashMap<Integer, String>();
		hmap.put(12, "dhiraj");
		hmap.put(15, "manish");
		hmap.put(14, "Sri");
		hmap.put(20, "Nivas");
		hmap.put(67, "Dande");
		hmap.put(98, "Ramesh");
		hmap.put(76, "Vivek");
		
		Set set=hmap.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
		Map map=sortByValue(hmap);
		System.out.println("After sorting");
		Set set1=map.entrySet();
		Iterator it1=set1.iterator();
		while(it1.hasNext()){
			Map.Entry me1=(Map.Entry)it1.next();
			System.out.println(me1.getKey());
			System.out.println(me1.getValue());
		}
	}


private static HashMap sortByValue(Map<Integer, String> hmap){
	List list=new LinkedList(hmap.entrySet());
	Collections.sort(list, new Comparator() {
		

		@Override
		public int compare(Object arg0, Object arg1) {
			return ((Comprable) ((Map.Entry) (o1)).getValue()));
		}
	});
}

