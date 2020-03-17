package Practice;

import java.util.*;

class Sort1 {
	public static void main(String args[]){
	String st[]={"dhiraj","manish","ramesh","bihar","dhiraj","bihar"};
	int len=st.length;
	Map<String,Integer> map=new HashMap<String,Integer>();
	for(int i=0;i<len;i++){
	if(map.containsKey(st[i])){
	map.put(st[i],map.get(st[i])+1);
	}else{
	map.put(st[i],1);
	}
	}
	System.out.println(map);
	Map map1=new TreeMap(map);
	System.out.println(map1);	
	}
	}