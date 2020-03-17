package com.datastructure;

import java.util.Arrays;

public class ArrayList {
	int size=0;
	Object obj[];
	public ArrayList() {
		obj=new Object[10];
		
	}
	public void add(Object data) {
		if(obj.length-size<=5) {
			//increasesListSize();
		}
		obj[size++]=data;
	}
	public void get(int index) {
		int stdata;
		stdata=(int) obj[index-1];
		System.out.println(stdata+"sdata");
	}
	public  void increasesListSize() {
		obj=Arrays.copyOf(obj, obj.length*2);
		System.out.println(obj.length+"length");
	}
	public void show() {
		for(int i=0;i<obj.length;i++) {
			if(obj[i]!=null)
			{
			System.out.println(obj[i]);
		}
		}
		
	}
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(new Integer(5));
		ar.add(new Integer(8));
		ar.add(new Integer(3));
//		ar.add(new Integer(6));
//		ar.add(new Integer(6));
//		ar.add(new Integer(6));
//		ar.add(new Integer(6));
//		ar.add(new Integer(6));
//		ar.get(1);
		ar.show();
	}

}
