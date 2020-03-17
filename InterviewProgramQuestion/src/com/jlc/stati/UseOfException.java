package com.jlc.stati;

public class UseOfException {
	public static void main(String[] args){
		
		
		try {
			int a=10/0;
		} catch (Exception  e) {
			e.printStackTrace();
			throw new BhosadivalaException();
		}
		System.out.println("mu");
	}
}
