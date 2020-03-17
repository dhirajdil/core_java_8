package InterviewProgram;

import java.util.*;

public class MethodCheck {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("dhiraj");
		list.add("dhiraj");
		list.add("manish");
		list.add("manish");
		list.add("patna");
		list.add("dabapur");
		list.add("masaurhi");
		list.add("patna");
		
		int len = list.size();
		
		Collections.sort(list);
		
		for(int i=1;i<len-3;i++){
			String st1=list.get(i);
			String st2=list.get(i-1);
			if(st1.equals(st2)){
				list.remove(i);
				i=i-1;
			}
		
		}
		System.out.println(list);
	}
	
}
