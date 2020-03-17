package com.jlc.stati;

		public class MyLab {
			public static void main(String[] args) {
				A a=new A();
				a.m1(10);
			}
		}
class A{
	public void m1(Object x){
	System.out.println("Integer");
	}
	public void m1(Integer str){
	System.out.println("String");
	}
}
