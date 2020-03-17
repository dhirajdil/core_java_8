package DataStructure.Recursive;

public class Lab1 {
	public static void main(String[] args) {
		bar();
		System.out.println("main");
	}
	static void  bar() {
		doWork();
		System.out.println("bar");
	}
	static void doWork() {
		doMore();
		System.out.println("dowork");
	}
	static void doMore() {
		System.out.println("doMore");
	}

}
