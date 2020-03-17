package com.exception;

public class Lab1184 {
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("result"+res);
		}catch(Exception e){
			System.out.println("provide correct calue");
		}catch(ArrayIndexOutOfBoundsException e){
			
		}catch(NumberFormatException e){
			
		}catch(ArithmeticException e){
			
		}
		System.out.println("main completed");
	}

}
