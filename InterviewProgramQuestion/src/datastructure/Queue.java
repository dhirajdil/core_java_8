package datastructure;

public class Queue {
     
	int q[]=new int[4];
	int top=0;
	
	public void push(int data) {
		q[top]=data;
		top++;
	}
	
}
