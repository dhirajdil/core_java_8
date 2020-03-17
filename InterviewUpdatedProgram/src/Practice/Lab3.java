package Practice;

import java.util.*;

class Lab3{
	public static void main(String args[]){
	String st[]={"A","A","B","C","D","E","C","F","F","G","A"};
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
	Set set=map.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
	Object obj=it.next();
	Map.Entry me=(Map.Entry)obj;

	int a=(int) me.getValue();
	
	if(a>1){
		System.out.println(me.getKey()+"=="+me.getValue());
	}
	}
	}
	
	
	}
