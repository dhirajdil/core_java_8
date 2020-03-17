package com.exception;

public class Lab1182 {
	public static void main(String[] args) {
		
		
		System.out.println("main started");
		int len=args.length;
		try{
			String data=args[0];
			int x=Integer.parseInt(data);
			int res=10/x;
			System.out.println("Result="+res);
			}catch(Exception e){
			System.out.println("Enter Correct Value");
		}
	}

}
