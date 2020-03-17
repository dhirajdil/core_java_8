package com.designpattern.builder;

public class Shop {
	public static void main(String[] args) {
		Phone p=new PhoneBuilde().setOs("Android").setRam(2).setBattery(32100).getPhone();
		System.out.println(p);
	}

}
