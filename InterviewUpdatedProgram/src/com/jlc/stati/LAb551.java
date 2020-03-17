package com.jlc.stati;

public class LAb551 {
	public static void main(String[] args) {
		Hello6 hel=null;
		System.out.println("ref created");
	}

}
class Hello6{
	static int a=10;
	{
		System.out.println("instance block");
	}
	static{
		System.out.println("static block");
	}
}
