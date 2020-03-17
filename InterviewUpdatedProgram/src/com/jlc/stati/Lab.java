package com.jlc.stati;

class Lab{
	public static void main(String args[]){
	Hello h1=new Hello();
	Hello h2=new Hello();
	MyThread th1=new MyThread(h1);
	MyThread th2=new MyThread(h1);
	th1.start();
	th2.start();
	}
	}


class MyThread extends Thread{
	Hello h;
	MyThread(Hello h){
	this.h=h;
	}
public void run(){
	h.m1();
	h.m2();
	}
	}
class Hello{
	public synchronized void m1(){
	for(int i=0;i<10;i++){
	System.out.println("dhiraj");
	try{
	Thread.sleep(500);
	}catch(Exception e){
	e.printStackTrace();
	}
	}	
	}

	public synchronized void m2(){
	for(int i=0;i<10;i++){
	System.out.println("dhiraj");
	try{
	Thread.sleep(500);
	}catch(Exception e){
	e.printStackTrace();
	}
	}}}
