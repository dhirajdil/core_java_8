package Practice;

public class Lab24 {
	public static void main(String[] args) {
		Tiger tg=new Tiger();
		tg.add(10, 20);
		System.out.println(tg.add(10, 20));
		
	}

}
class Tiger{
	int add(int a,int b){
		return a+b;
	}
	void add(int a,int b,int c){
		System.out.println("int a int b");
	}
}
