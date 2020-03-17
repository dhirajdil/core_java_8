package Practice;

public class Lab6 {
	public static void main(String[] args) {
		X x=new X();
		x.add(null);
	}

}
class X{
	public void add(int st){
		System.out.println("String");
	}
	public void add(Object o){
		System.out.println("Object");
	}
}
