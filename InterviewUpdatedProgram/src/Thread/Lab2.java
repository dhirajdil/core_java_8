package Thread;

public class Lab2 {
	public static void main(String args[]) {
		Hello h1=new Hello();
		//Hello h1=new Hello();
		MyThread th1=new MyThread(h1);
		MyThread th2=new MyThread(h1);
		th1.start();
		th2.start();
		
	}

}
class MyThread extends Thread{
	MyThread(Hello h1){
		h1.m1();
		h1.m2();
	}
	
}

class Hello{
	public synchronized void m1() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"m1");
		}
	}
   public synchronized void m2() {
	   for(int i=0;i<10;i++) {
			System.out.println(i+"m2");
		}
	}

}