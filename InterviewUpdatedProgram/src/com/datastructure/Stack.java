package com.datastructure;

public class Stack {
	
	int top=0;
	int a[]=new int[3];
	public void push(int data) {
		a[top]=data;
		top++;
	}
	public void show() {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public int pop(){
		int data;
		top--;
		data=a[top];
		a[top]=0;
		return data;
	}
	public int pick() {
		int data;
		data=a[top-1];
		return data;
	}
	public int size() {
		return top;
	}

}
