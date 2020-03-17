package Practice;

class A{
	public void m1(Object obj){
		System.out.println("Object version");
	}
	
}
class B extends A{
 public void m1(String st){
		System.out.println("string version");
	}
	
	
}
public class Lab12 {
	public static void main(String[] args) {
		A a=new B();
		a.m1("dhiraj");
		
	}

}
 
