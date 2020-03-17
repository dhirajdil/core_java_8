package DataStructure;

public class Stack {
	int top=0;
	int arr[]=new int[6];
	public void push(int data) {
	    arr[top]=data;
			top++;
		}
	public void show() {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public int pop() {
		int data;
		top--;
		data=arr[top];
		arr[top]=0;
		return data;
	}
	public int peek() {
		int data;
		data=arr[top-1];
		return data;
	}
	public int size() {
		return top;
	}
}
