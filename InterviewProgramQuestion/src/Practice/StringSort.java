package Practice;

import java.util.*;
class StringSort{
	public static void main(String args[]){
	String st[]={"Dhiraj","Kumar","Dhiraj","Kumar","Akhilesh","Bihar","Chandan","Chandan"};
	int len=st.length;
	Map<String,Integer> map=new HashMap<String,Integer>();
	for(int i=0;i<len;i++){
	if(map.containsKey(st[i])){
	map.put(st[i],map.get(st[i])+1);
	}else
	map.put(st[i],1);
	}
	
	System.out.println(map);
	Collections.sort((List<T>) map);
	
	}
	}
