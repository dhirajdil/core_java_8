package com.jlc.stati;

import java.util.*;
public class Iterat {
	public static void main(String args[]){
		List list=new ArrayList();
		list.add("dhiraj");
		list.add("manish");
		list.add("bihar");
		list.add("patna");
		list.add("gya");
		Iterator it=list.iterator();
		while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
		}
		}
}
