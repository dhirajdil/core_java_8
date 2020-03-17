package com.jlc.stati;

public class Lab549 {
		public static void main(String[] args) {
			System.out.println(Hello4.a);
		}
}
class Hello4{
	static int a;
	static{
		a=10;
		System.out.println("static block"+a);
	}
}
