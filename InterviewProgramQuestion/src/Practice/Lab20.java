package Practice;

class Emp {
	void add(int a,int b) throws Exception{
		System.out.println("add");
	}
	void add(int a,int b,int c){
		System.out.println("add");
	}
}
class Cemp extends Emp {
	public void add(int a,int b,int c){
		System.out.println("child addition");
	}
}
public class Lab20 {
	public static void main(String[] args) {
		Emp emp=new Emp();
		emp.add(10,20,30);
	}

}
