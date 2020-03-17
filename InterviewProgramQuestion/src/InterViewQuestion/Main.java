package InterViewQuestion;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	   String str="hello java";
	   String[] str2=str.split(" ");
	   for(int i=0;i<str2.length;i++){
	   reverseStr(str2[i]);
	   }
	   
	}
	public static void reverseStr(String str){
		String strRev="";
		for(int j=str.length()-1;j>=0;j--) 
		{
			if(j==str.length()-1){
				char c=' ';
				c=str.charAt(j);
				c -=32;
			strRev+=c;
			}
			else if(j==0){
				char c=' ';
				c=str.charAt(j);
				c+=32;
				strRev+=c;
			}
			else{
				strRev=strRev+str.charAt(j);
			}
			
		}
	System.out.print(" "+ strRev);
		
	}
	
	}
	
			





