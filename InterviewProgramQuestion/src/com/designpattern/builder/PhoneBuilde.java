package com.designpattern.builder;

public class PhoneBuilde {
	private String os;
	private int ram;
	private String processor;
	private double screenSize;
	private int battery;
	public PhoneBuilde setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilde setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilde setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilde setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilde setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, ram, processor,  screenSize, battery);
	}
}
