package InterviewProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FIleReader {
	public static void main(String[] args) throws IOException{
	BufferedReader bf=new BufferedReader(new FileReader("J:\\dhiraj.txt"));
	String line=bf.readLine();
	
	System.out.println(line);
	String st[]=line.split(" ");
	int len=st.length;
	Map<String,Integer> map=new HashMap<String,Integer>();
	for(int i=0;i<len;i++){
		if(map.containsKey(st[i])){
			map.put(st[i], map.get(st[i])+1);
			
		}else{
			map.put(st[i], 1);
		}
		
	}
	System.out.println(map);
	
	Set set=map.entrySet();
	Iterator it=set.iterator();
	int max=0;
	String mostrepetedword=null;
	while(it.hasNext()){
		Object obj=it.next();
		Map.Entry mpe=(Map.Entry)obj;
		int i=(int)mpe.getValue();
		System.out.println(i);
		if(i>max){
			mostrepetedword=(String) mpe.getKey();
			max=i;
			
		}
		
	}
	System.out.println(mostrepetedword);
	System.out.println(max);
	}

}
