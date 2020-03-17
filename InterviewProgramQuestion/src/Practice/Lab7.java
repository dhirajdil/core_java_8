package Practice;
import java.util.*;
import java.util.Map.Entry;
public class Lab7 {
	public static void main(String[] args) {
		String a[]={"dhiraj","manish","vivek","ramesh","neeraj","dhiraj","ramesh","dhiraj"};
		int len=a.length;
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<len;i++){
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
				
			}else{
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
        List<Entry<String, Integer>> listOfentrySet = new ArrayList<Entry<String, Integer>>(entrySet);
       
        Collections.sort(listOfentrySet, new SortByKeyAscending());
       
 
        System.out.print("\nAfter sorting by key(ascending): ");
        for(Map.Entry<String, Integer> entry:listOfentrySet)
         System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
       
    }

	}
class SortByKeyAscending implements Comparator<Map.Entry<String, Integer>>{
	 
    @Override
    public int compare( Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2){
        return (entry1.getKey()).compareTo( entry2.getKey() );
    }
}
 


