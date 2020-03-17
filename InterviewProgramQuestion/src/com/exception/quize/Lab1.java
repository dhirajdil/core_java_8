package com.exception.quize;

import javax.management.RuntimeErrorException;

public class Lab1 {
	public static void main(String[] args) {
		try {
			badMethod();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
 public static void  badMethod() {
	 throw new RuntimeException();
 }
}
