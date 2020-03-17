package InterViewQuestion;

class A{
//	public void show(int a) {
//		System.out.println("int a");
//	}
	public void show(int a,int b){
		System.out.println("(int a,int b)");
	}
	public void show(long a,long b){
		System.out.println("(long a,long b)");
	}
	public void show(Integer a,Integer b){
		System.out.println("(Integer a,Integer b)");
	}
	public void show(int ...a){
		System.out.println("(Integer ...a)");
	}
	
}

/*class B extends A{
	public void show(int a,long b){
		System.out.println("class B");
	}
}
*/
public class Overriding {
public static void main(String[] args) {
	A a =new A();
	a.show(10);
	a.show(10,10);
	
}
}