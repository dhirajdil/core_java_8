package InterviewProgram;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateList {
	public static void main(String[] args) {
		System.out.println(args.length);
		List list=new ArrayList<>();
		list.add("hcl");
		list.add("hcl");
		list.add("technologies");
		list.add("sjr");
		list.add("dhiraj");
		list.add("dhiraj");
		list.add("dhiraj");
		
		int len=list.size();
		for(int i=1;i<len-1;i++){
			String st1=(String) list.get(i);
			String st2=(String)list.get(i-1);
			if(st1.equals(st2)){
				list.remove(i);
			}
			
		}
		System.out.println(list);
	}

}
