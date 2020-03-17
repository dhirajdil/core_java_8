package Thread;

public class Lab1297 {
	public static void main(String[] args) {
		
		MyThread2 th=new MyThread2();
		Thread th1=new Thread(th);
		Thread th2=new Thread(th);
		th1.start();
		th2.start();
		Thread t=Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(t.getName()+""+t.getThreadGroup());
		}
	}

}
class MyThread2 implements Runnable{
	public void run() {
		Thread th=Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(th.getName()+""+th.getThreadGroup());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e.getSuppressed());
			}
		}
	}
	
}
