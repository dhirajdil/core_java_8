package com.jlc.stati;

public class Lab554 {
		public static void main(String[] args) {
			System.out.println("Main:"+Hello9.a);
		}
}
class Hello9{
	static int a;
	{
		a=10;
		System.out.println("instance block");
	}
}
