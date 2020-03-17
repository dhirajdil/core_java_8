package com.jlc.stati;

public class Test2 {
        public static void main(String args[]){
        	Apple.m1();
        }
}
class Apple{
	public static void m1(){
		try{
			System.out.println(1);
			int i=10/0;
			System.out.println(2);
			return;
		}catch(ArithmeticException e){
			System.out.println(3);
		}catch(Exception e){
			System.out.println(4);
		}
		finally{
			System.out.println(5);
		}
		System.out.println(6);
	}
	
}
