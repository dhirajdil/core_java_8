package InterViewQuestion;
import java.util.*;
public class DuplicateList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("dhiraj");
		list.add("manish");
		list.add("dhiraj");
		list.add("manish");
		
		int len=list.size();
		for(int i=1;i<len-1;i++){
			String name1=list.get(i);
			String name2=list.get(i-1);
			if(name1.equals(name2)){
				list.remove(i);
			}
			
		}
		
		System.out.println(list);
	}
}
