package com.jlcindia.debug;

import java.util.*;

public class Lab1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		String st=addNumber(st1,st2);
		System.out.println(st);
	}
	public static String addNumber(String n1,String n2){
	  String n3=n1+n2;
		return n3;
	}

}
