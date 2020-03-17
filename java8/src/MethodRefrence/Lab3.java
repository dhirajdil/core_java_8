package MethodRefrence;

public class Lab3{
	public static void main(String[] args) {
		Repos rep=new Repository();
		rep.m1();
		Repos.add();
		
		
	}

}

interface Repos{
	default void m1() {
		System.out.println("default1");
	}
	static void add() {
		System.out.println("static1");
	}
}
class Repository implements Repos{
	public void m1() {
		System.out.println("default2");
	}
	static void add() {
		System.out.println("static2");
	}
}
