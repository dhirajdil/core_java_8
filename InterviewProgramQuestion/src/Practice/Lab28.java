package Practice;

public class Lab28 {
	public static void main(String[] args) {
		Rat rt=new Rat();
		String dh=rt.m1("dhiraj");
		System.out.println(dh);
	}

}
class Rat{
	public void m1(int a){
		System.out.println("dhiraj");
	}
	public String m1(String st){
		return st;
	}
}
