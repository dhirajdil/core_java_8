package com.exception;

public class Lab1187 {
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			int res=10/0;
			System.out.println("result"+res);
		}
//		System.out.println("dhiraj"); not possible
		catch(NumberFormatException e){
			System.out.println("invalid input");
		}
	System.out.println("main completed");
	}

}
