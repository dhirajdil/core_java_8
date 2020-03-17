package com.exception;

public class lab1188 {
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			int res=Integer.parseInt("JLC");
		}catch(NumberFormatException e){
			System.out.println("input invalid");
			int x=10/0;
		}catch(ArithmeticException e){
			System.out.println("devided by zero");
		}
		System.out.println("main completed");
	}

}
