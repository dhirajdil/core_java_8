package com.jlc.stati;

public class Lab548 {
		public static void main(String[] args) {
			System.out.println(Hello3.a);
		}
}
 class Hello3{
	static int a;
	{
		a=10;
		System.out.println("block"+a);
	}
}