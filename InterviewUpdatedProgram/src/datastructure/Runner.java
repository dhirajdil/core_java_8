package datastructure;

public class Runner {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(13);
		list.insert(23);
		
		list.show();
		list.insertAtStart(25);
		list.detete(2);
		
	}

}
