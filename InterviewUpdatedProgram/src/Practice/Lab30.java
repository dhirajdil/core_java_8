package Practice;

public class Lab30 {
	public static void main(String[] args) {
		MyClass my=new MyClass();
		my.myMethod(new Runnable(){
			public void run(){
				
			}
		});
		
	}

}
class MyClass{

	public void myMethod(Runnable runnable) {
		// TODO Auto-generated method stub
		
	}
	
}
