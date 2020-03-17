package com.jlcindia.debug;

import java.util.*;
public class Lab3 {
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "dhiraj");
		map.put(2, "manish");
		map.put(3, "bihar");
		map.put(4, "patna");
		
		Animal an=new Animal();
		Map map1=(Map) an.addMethod(map);
		System.out.println(map1);
	}

}
