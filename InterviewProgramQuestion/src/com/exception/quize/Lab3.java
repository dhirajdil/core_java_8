package com.exception.quize;

public class Lab3 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3/0);
			System.out.println(4);
		}catch(ArithmeticException a){
			System.out.println(5);
		}catch(NullPointerException n) {
			System.out.println(6);
		}catch(Exception e) {
			System.out.println(7);
		}finally {
			System.out.println(8);
		}
		System.out.println(9);
	}

}
