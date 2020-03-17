package com.basic;

public class MainClass {
	        public static void main(String[] args) {
	        	ListImpl list=new ListImpl();
	        	list.insert(12);
	        	list.insert(24);
	        	list.insert(88);
        	    list.insertAtFirst(99);
        	    list.insertAt(2, 20);
	        	list.show();
				
			}

}
