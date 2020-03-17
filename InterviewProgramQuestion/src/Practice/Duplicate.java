package Practice;

import java.util.*;
class Duplicate{
    public static void main(String args[]){
    	int max=0;
    	int val=0;
int arr[]={7, 8, 9, 1, 3, 6, 6, 7, 3, 3, 3, 9 };
 Map<Integer,Integer> map=new HashMap<Integer,Integer>();
 for(int i=0;i<arr.length;i++){
 if(map.containsKey(arr[i])){
    map.put(arr[i],map.get(arr[i])+1);
  }else{
	map.put(arr[i],1);
	}
 }
 System.out.println(map);
 Set set=map.entrySet();
 Iterator it=set.iterator();
 while(it.hasNext()){
 Object obj=it.next();
 Map.Entry mpe=(Map.Entry)obj;
 System.out.println(mpe.getKey()+" "+mpe.getValue());
   int k=(int) mpe.getKey();
   int v=(int) mpe.getValue();
   if(v>max) {
	   max=v;
	   val=(int) mpe.getKey();
	   
   }
}
 System.out.println(max+"times"+val);
 System.out.println(val);
}	
}
