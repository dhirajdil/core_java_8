package com.datastructure;

public class LinkedList {

	Node head, curr, temp;
	
	public void addLast(int data) {
		
		temp = new Node(data);
		
		if(head==null) {
			head = curr = temp;
		} else {
			
			curr.next = temp;
			curr = temp;
		}
	}
	
	public void addFirst(int data) {
		
		temp = new Node(data);
		if(head == null) {
			head = curr = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}
	
	public void print() {
		Node temp = head;
		
		while(temp!=null ) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String arg[]) {
		
		LinkedList list = new LinkedList();
		list.addFirst(1000);
		list.addFirst(2000);
		list.addFirst(3000);
		list.addFirst(4000);
		
		list.print();
	}
}
