package datastructure;

public class Stack {
	 int a[]=new int[4];
	 int top=0;
     public void push(int data) {
    	a[top]=data;
    	top++;
     }
     public void show() {
    	for(int n:a) {
    		System.out.println(n);
    	}
    	
    	}
     public int pop() {
 		int data;
 		top--;
 		data=a[top];
 		a[top]=0;
 		return data;
    	 
     }
     public int peek() {
  		int data;
  		
  		data=a[top-1];
  		
  		return data;
     	 
      }
}
