package datastructure;

public class TNStack {
	private int size;
	private int [] stackArr;
	private int top=-1;
	
	public TNStack(int size){
		this.size=size;
	}
	public void push(int i){
		top++;
		System.out.println("pushing"+i);
		stackArr[top]=i;
	}
	
	public int pop(){
		int i=stackArr[top];
		top--;
		System.out.println("popping"+i);
		return i;
	}
	public int peek(){
		System.out.println("Peek:"+stackArr[top]);
		return stackArr[top];
	}
	public boolean isFull(){
		return (top==size-1);
	}
	public boolean isEmpty(){
		return (top==-1);
	}
}
