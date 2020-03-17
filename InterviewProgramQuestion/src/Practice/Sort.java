package Practice;

import java.util.*;

class Sort{
	public static void main(String args[]){
	
	int a[]={4,5,7,2,4,9,1,1,6,8};
	int len=a.length;
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	for(int i=0;i<len;i++){
	if(map.containsKey(a[i])){
	map.put(a[i],map.get(a[i])+1);
	}else{
	map.put(a[i],1);
	}
	}
	System.out.println(map);
	Set set=map.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
	Object obj=it.next();
	Map.Entry mpe=(Map.Entry)obj;
	
	int b[]=new int[(int)mpe.getKey()];
	int leng=b.length;
	System.out.println(leng);
	
	}
	
	}
	}
