package com.jlc.stati;

public class Lab547 {
		public static void main(String[] args) {
			Hello2 h=new Hello2();
			
			System.out.println("main method"+h.a);
		}
}
class Hello2{
	int a;
	{
		a=10;
		System.out.println("block a"+a);
	}
}
