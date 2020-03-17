package DataStructure;

public class Runner {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(5);
		list.insert(15);
		list.insert(20);
		list.insert(12);
		list.insertStart(21);
//		list.insertAt(3, 75);
//		list.reverseShow();
		list.show();
		
		Node mid=list.getMiddleElement();
		System.out.println(mid.data);
		
		
		//list.deleteAt(2);
		
	}

}
