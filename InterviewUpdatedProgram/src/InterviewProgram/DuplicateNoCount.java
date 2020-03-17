package InterviewProgram;



 
import java.util.*;

public class  DuplicateNoCount{
	public static void main(String[] args) {
		int max=0;
		int high=0;
		int arr[] = {7, 8, 9, 1, 3, 6, 6, 7, 3, 3, 3, 9 };
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int value = map.get(arr[i]);

				value++;
				map.put(arr[i], value);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj=it.next();
			Map.Entry<Integer, Integer> mpe=(Map.Entry<Integer, Integer>)obj;
	//		System.out.println(mpe.getKey()+" "+mpe.getValue());
			
			int i=mpe.getValue();
			int j=mpe.getKey();
			if(i==1){
				System.out.println(mpe.getKey()+" "+mpe.getValue());	
			}
			
			
			if(i>max){
				max=i;
				high=mpe.getKey();
			}
			
		}
		System.out.println(max+"maximum1");
		System.out.println(high+"maximum2");
	}

}