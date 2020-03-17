package Practice;

public class Lab37 {
	public static void main(String[] args) {
		
	}

}
class Outer{
	int a=10;
	static int b=20;
	public static void show(){
		System.out.println(a);
		System.out.println(b);//inside static method u cant access instance method,only after creating object
	}
}
