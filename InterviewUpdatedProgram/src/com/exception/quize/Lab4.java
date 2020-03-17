package com.exception.quize;

import java.util.*;

public class Lab4 {
	public static void main(String[] args) {
//		List list=new ArrayList();
//		list.add("dhiraj");
//		list.add("manish");
//		list.add("vibek");
//		list.add("ravi");
//		
//		Iterator it=list.iterator();
//		while(it.hasNext()) {
//			Object obj=it.next();
//			System.out.println(obj+"Kumar");
//		}
		
//		String st="mini gupta";
//		
//		String ar[]=st.split(" ");
//		int len=ar[0].length();
//		String st1="";
//		for(int i=len-1;i>=0;i--) {
//			char c=ar[0].charAt(i);
//			st1+=c;
//		}
//		System.out.println(st1+" "+ar[1]);
		
		String st="dhiraj kumar singh";
		String st1="";
		String ar[]=st.split(" ");
		int len=ar[1].length();
		for(int i=len-1;i>=0;i--) {
			char c= ar[1].charAt(i);
			st1+=c;
		}
		System.out.println(ar[0]+" "+st1+" "+ar[2]);
	}

}
