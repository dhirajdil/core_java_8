package comPractice;

public class Lab884 {
    public static void main(String[] args) {
		B b=new B();
		b.show();
		b.SHOW();
	}
}
class A{
	void show() {
		System.out.println("a");
	}
}
class B extends A{
	void SHOW() {
		System.out.println("b");
	}
}
