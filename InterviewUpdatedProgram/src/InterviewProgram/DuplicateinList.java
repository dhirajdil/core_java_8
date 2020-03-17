package InterviewProgram;
import java.util.*;


public class DuplicateinList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hcl");
		list.add("hcl");
		list.add("technologies");
		list.add("sjr");
		list.add("dhiraj");
		list.add("dhiraj");
		list.add("dhiraj");
		
		//int len=list.size();
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).equals(list.get(j))){
					list.remove(j);
					j--;
					
				}
			}
			
		}
		System.out.println(list);
	}

}
