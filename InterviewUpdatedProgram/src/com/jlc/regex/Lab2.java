package com.jlc.regex;

import java.util.*;

public class Lab2 {
		public static void main(String[] args) {
			
			Map<Std,String> map=new HashMap<Std,String>();
			map.put(new Std(1,"A"), "patna");
			map.put(new Std(1,"A"), "gya");
			
			System.out.println(map);
		}
		
}
class Std{
	int roll;
	String name;
	
	
	
	 Std(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return roll;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Std) {
			Std st=(Std)obj;
			return st.roll==this.roll && st.name.equals(this.name);
		}
		return false;
	}
}
