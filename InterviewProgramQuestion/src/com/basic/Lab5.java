package com.basic;

import java.util.*;

public class Lab5 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("dhiraj",(new User(1,"dhiraj","dhiraj@gmail.com")));
		map.put("manish",2);
		map.put("patna",3);
		map.put("bihar",4);
		
		System.out.println(map);
		System.out.println(map.get("dhiraj"));
	}

}

class User{
	int id;
	String name;
	String email;
	
	User(int id,String name,String email){
		this.id=id;
		this.name=name;
		this.email=email;;
	}
	public String toString()
	{
		return id+" "+name+" "+email;
	}
}