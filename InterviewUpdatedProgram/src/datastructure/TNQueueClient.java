package datastructure;

public class TNQueueClient {
	public static void main(String[] args) {
		TnQueue tnq=new TnQueue(3);
		if(!tnq.isFull())
			tnq.insert(4);
		if(!tnq.isFull())
			tnq.insert(5);
		if(!tnq.isFull())
			tnq.insert(6);
		if(!tnq.isFull())
			tnq.insert(3);
		
		else
			System.out.println("Queue is full cannt insert in element");
		
		if(!tnq.isEmpty())
			tnq.remove();
		if(!tnq.isEmpty())
			tnq.remove();
		if(!tnq.isEmpty())
			tnq.remove();
		if(!tnq.isEmpty())
			tnq.remove();
		else
			System.out.println("Queue is empty cant remove element");
	}

}
