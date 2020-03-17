package Practice;
import java.util.*;
import java.util.Map.Entry;
public class Lab1 {
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
		Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
            System.out.println(map);
        }
    }

	}


