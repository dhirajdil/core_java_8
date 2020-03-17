package innerclass;

class Outer{
	int a=10;
	static int b=20;
	void m1(){
		System.out.println("Outer->m1()");
	}
	static void m2(){
		System.out.println("Inner->m2()");
	}
	class Inner{
		int x=11;
		 void show(){
			System.out.println("inner->show()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			m1();
			m2();
		}
	}
}
public class Lab961 {
	
	public static void main(String[] args) {
		Outer out=new Outer();
		out.m1();
		out.m2();
		//Outer.m2();
		Outer.Inner oinn=new Outer().new Inner();
		oinn.show();
		
	}

}
