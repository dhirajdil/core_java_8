package com.exception;

public class Lab1183 {
	public static void main(String[] args) {
		System.out.println("main");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("result"+res);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("provide one value by CLA");
		}catch(NumberFormatException e){
			System.out.println("provide int value by CLA");
		}catch(ArithmeticException e){
			System.out.println("provide non zero value");
		}
		System.out.println("main completed");
	}

}
