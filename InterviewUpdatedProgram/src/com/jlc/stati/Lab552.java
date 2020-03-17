package com.jlc.stati;

public class Lab552 {
		public static void main(String[] args) {
			Hello7 h=null;
			System.out.println("Ref Created");
			h=new Hello7();
		}
}
class Hello7{
	{
		System.out.println("Instance block");
	}
	static{
		System.out.println("Static block");
	}
}
