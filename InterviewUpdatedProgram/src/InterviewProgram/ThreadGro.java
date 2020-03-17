package InterviewProgram;

public class ThreadGro {
	public static void main(String[] args) {
		ThreadGro runnable=new ThreadGro();
		ThreadGroup th=new ThreadGroup("MyThread Group");
		Thread t1=new Thread(th,"one");
		t1.start();
		Thread t2=new Thread(th,"two");
		t2.start();
		Thread t3=new Thread(th,"three");
		t3.start();
	}

}
class Emplo implements  Runnable {
	public void run() {
		 System.out.println(Thread.currentThread().getName());  
	}
}
