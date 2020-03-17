package com.basic;

public class Lab2 {
     public static void main(String[] args) {
		Hello h=new Hello();
		
	}
}
class Hai{
	static {
		System.out.println("Hai->S.B");
	}
}
class Hello extends Hai{
	static {
		System.out.println("Hello-S.B");
	}
}
