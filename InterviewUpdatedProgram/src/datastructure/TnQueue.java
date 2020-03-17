package datastructure;

public class TnQueue {
	private int size;
	private int[] queueArr;
	private int front=-1;
	private int rear=-1;
	private int totalitems;
	
	public TnQueue(int s){
		size=s;
		queueArr=new int[s];
		
	}
	public void insert(int i){
		rear++;
		System.out.println("Insertimg:"+i);
		queueArr[rear]=i;
		totalitems++;
	}
	public int remove(){
		front++;
		totalitems--;
		System.out.println("Removing"+queueArr[front]);
		return queueArr[front];
	}
	public boolean isFull(){
		
		return (totalitems==size);
	}
	public boolean isEmpty(){
		return  (totalitems==0);
	}

}
