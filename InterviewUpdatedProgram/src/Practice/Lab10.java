package Practice;
class Parent{
	public void m1(int...x){
		System.out.println("parent");
	}
}
class Chield extends Parent{
	public void m1(int x){
		System.out.println("chield");
	}
}
public class Lab10 {
		public static void main(String[] args) {
			Parent p=new Parent();
			p.m1(10);
			Chield c=new Chield();
			c.m1(10);
			Parent p1=new Chield();
			p1.m1(10);
		}
}
