package Practice;

public class Lab31 {
	public static void main(String[] args) {
		Parent p=new  Parent();
		Chield c=new Chield();
		Parent pc=new Chield();
		System.out.println(p.a);
		System.out.println(c.a);
		System.out.println(pc.a);
	}

}
class Parent{
	int a=888;
}
class Chield extends Parent{
	int a=999;
}
