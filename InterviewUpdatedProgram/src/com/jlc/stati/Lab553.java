package com.jlc.stati;

public class Lab553 {
		public static void main(String[] args) {
			Hello8 h1=new Hello8();
			new Hello8();
		}
}
class Hello8{
	{
		System.out.println("Instance Block");
	}
	static{
		System.out.println("static block");
	}
}