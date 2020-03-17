package synchronization;

public class Lab1312 {
	public static void main(String[] args) {
		Hello h1=new Hello();
		Hello h2=new Hello();
		MyThread th1=new MyThread(h1);
		MyThread th2=new MyThread(h1);
		
		th1.start();
		th2.start();
		
	}

}
class MyThread extends Thread{
	Hello h=null;
	MyThread(Hello h){
		this.h=h;
	}
	public void run() {
		h.m1();
		h.m2();
	}
	
}
class Hello{
	synchronized void m1() {
		System.out.println("dhiraj1");
	}
	 void m2() {
		System.out.println("dhiraj2");
	}
}
