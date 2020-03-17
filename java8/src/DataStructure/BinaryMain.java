package DataStructure;

public class BinaryMain {
	public static void main(String[] args) {
		BinaryMiddle tree=new BinaryMiddle();
		for(int i=0;i<10;i++) {
			tree.insert(i*10);
		}
		System.out.println("Searching the node 50 in tree.....");
		tree.search(50);
	}

}
