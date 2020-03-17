package Practice;

import java.util.*;

public class Lab21 {
	public static void main(String[] args) {
		String st = "abcbaacgffg";

		char ch[] = st.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int len = ch.length;
		for (int i = 0; i < len; i++) {
			if (map.containsKey(ch[i])) {

				map.put(ch[i], map.get(ch[i]) + 1);

			} else {
				map.put(ch[i], 1);
			}
		}
		Set set=map.entrySet();
		Iterator it=set.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			Map.Entry mpe=(Map.Entry)obj;
			int i=(int) mpe.getValue();
			if(i<3){
				System.out.println(mpe.getKey()+" "+mpe.getValue());
				
			}
		}

	}

}
