package com.datastructure;

public class Runner {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(15);
		st.push(20);
		st.push(12);
		System.out.println("size of stack"+st.size());
		st.show();
		System.out.println(st.pop());
		System.out.println(st.pick());
				
	}

}
