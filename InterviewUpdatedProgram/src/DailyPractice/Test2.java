package DailyPractice;

//public class Test2 {
//	public static void main(String[] args) {
//		B a=new B();
//		a.m1("Dhiraj", 10);
//		a.m1(10, "manish");
//	}
//
//}
class Test2{
	private void m1(int a,String b){
		System.out.println("int and String");
	}
	private void m1(String b,int a){
		System.out.println("String and integer");
	}
	public static void main(String args[]){
		Test2 b=new Test2();
		b.m1(10, "dhiraj");
		b.m1("Babita", 9);
	}
}

