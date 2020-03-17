package Practice;

public class Lab884 {
    public static void main(String[] args) {
		B b=new B();
		b.show();
	}
}
class A{
	void show() {
		System.out.println("B");
	}
}
class B extends A{
	void show() {
		System.out.println("B");
	}
}
