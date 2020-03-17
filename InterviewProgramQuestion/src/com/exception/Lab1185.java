package com.exception;

public class Lab1185 {
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("result"+res);
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("provide one value of CLA");
	}catch(NumberFormatException e){
		System.out.println("provide int value of CLA");
	}catch(ArithmeticException e){
		System.out.println("provide mon zero int value of CLA");
	}catch(Exception e){
		System.out.println("provie correct value");
	}
	}
}
