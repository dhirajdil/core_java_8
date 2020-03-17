package DailyPractice;

public class Lab1199{
	public static void main(String[] args) {
		System.out.println("main started");
		int res=new Hello().show();
		System.out.println("main"+res);
		System.out.println("main completed");
	}

}
class Hello{
	int show(){
		int a=0;
		try{
			System.out.println("try block begin"+a);
			a=10/0;
			System.out.println(a);
			return a;
		}catch(ArithmeticException e){
			a=20;
			System.out.println("catch block"+a);
			return a;
		}finally{
			a=30;
			System.out.println("finally block"+a);
		}
	}
}
