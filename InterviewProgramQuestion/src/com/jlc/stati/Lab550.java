package com.jlc.stati;

public class Lab550 {
	public static void main(String[] args) {
		Hello5 h=null;
		//System.out.println(h.b);
		System.out.println(Hello5.a);
		//System.out.println(Hello5.a);
	}

}
class Hello5{
	int b=89;
	static int a=10;
	{
		System.out.println("instance block");
	}
	static{
		System.out.println("static block");
	}
}
