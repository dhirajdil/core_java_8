package InterViewQuestion;
import java.util.*;


public class DuplicateinList {
	public static void main(String[] args) {
		List list=new ArrayList<>();
		list.add("hcl");
		list.add("hcl");
		list.add("technologies");
		list.add("sjr");
		list.add("dhiraj");
		list.add("dhiraj");
		
		int len=list.size();
		for(int i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(list.get(i).equals(list.get(j))){
					System.out.println(list.get(j));
					
					
				}
			}
		}
	}

}
