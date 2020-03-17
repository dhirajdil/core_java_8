package com.basic;

public class Lab3 {
	public static void main(String[] args) {
		String st="dhiraj";
		String st1="";
		char c[]=st.toCharArray();
		int a=c.length;
		for(int i=a-1;i>=0;i--) {
			char c1=c[i];
			st1+=c1;
		}
		System.out.println(st1);
	}

}
