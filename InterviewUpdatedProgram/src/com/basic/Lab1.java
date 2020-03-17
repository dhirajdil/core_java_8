package com.basic;

public class Lab1 {
	public static void main(String[] args) {
		int a[]= {1,3,6,8,9};
		Return r=new Return();
		r.m1(a);
	}

}
class Return{
	public int m1(int a[]) {
		return new int{1,3,6,8,9};
	}
}
