package DailyPractice;

interface AgradeCollege{
	
}
class B implements AgradeCollege{
	
}
class A{
	
}
public class MarkerInterface {
		public static void tester(Object obj){
			System.out.println("marker interface");
		}
		public static void main(String[] args) {
			A a=new A();
			B b=new B();
			tester(a);
			tester(b);
			
		}
}
