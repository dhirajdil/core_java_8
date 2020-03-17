package datastructure;

public class Runner {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(13);
		list.insert(23);
		
		list.insertAt(2, 38);
		//list.insertAtStart(25);
		list.show();
		list.detete(2);
		
		
	}

}
