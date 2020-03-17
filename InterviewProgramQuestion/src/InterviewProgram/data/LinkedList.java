package InterviewProgram.data;

import java.io.Console;

public class LinkedList {
		Node head;
		
		public void insert(int data) {
			Node node=new Node();
			node.data=data;
			node.next=null;
			
			if(head==null) {
				head=node;
			  }else {
				  Node n=head;
				  while(n.next!=null) {
					  n=n.next;
				  }
				  n.next=node;
			  }
			}
		public void show() {
			Node n1=head;
			System.out.println(n1.next);
			while(n1.next!=null) {
				System.out.println(n1.data);
				n1=n1.next;
			}
			System.out.println(n1.data);
		}
		public void reverseShow() {
			Node pre=null;
			Node current=head;
			Node next=null;
			
			while(current!=null) {
				next=current.next;
				current.next=pre;
				pre=current;
				current=next;
				
			}
			head=pre;
			
		}
		public void insertAt(int index,int data) {
			Node node=new Node();
			node.data=data;
			node.next=null;
			
			Node n=head;
			for(int i=0;i<index-1;i++) {
				System.out.println(n.next);
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
			
		}
		public void insertStart(int data) {
			Node node=new Node();
			node.data=data;
			node.next=null;
			node.next=head;
			head=node;
		}
		
		public Node getMiddleElement() {
			Node haad;
			if(head==null) {
				return null;
			}
			Node slowPtr=head;
			Node fastPtr=head;
			while(fastPtr!=null && fastPtr.next!=null) {
				slowPtr=slowPtr.next;
				fastPtr=fastPtr.next.next;
			}
			
			return slowPtr;
		}
		public void deleteAt(int index) {
			if(index==0) {
				head=head.next;
			}else {
				Node n=head;
				Node n1=null;
				for(int i=0;i<index-1;i++) {
					n=n.next;
				}
				n1=n.next;
				n.next=n1.next;
				System.out.println(n1.data);
			}
		}
}
