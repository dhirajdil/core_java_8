package DailyPractice;
import java.util.*;


public class IntersectionList{
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		List lis=new ArrayList();
		lis.add(2);
		lis.add(4);
		lis.add(6);
//		List li=new ArrayList();
//		for(int i=0;i<list.size();i++){
//			for(int j=0;j<lis.size();j++){
//				if(list.get(i).equals(lis.get(j))){
//					li.add(i);
//				}
//			}
//			
//		}
//		System.out.println(li);
		
		list.retainAll(lis);
		System.out.println(list);
	}

}
