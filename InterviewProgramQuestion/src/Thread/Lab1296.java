package Thread;

public class Lab1296 {
	public static void main(String[] args) {
		System.out.println("dhiraj");
	MyThread1 th1=new MyThread1();
	
	MyThread1 th2=new MyThread1();
	th1.setName("threa1");
	th2.setName("threa2");
	th1.start();
	th2.start();
	
	Thread t=Thread.currentThread();
	for(int i=0;i<10;i++) {
		System.out.println(t.getName()+"main thread");
	}
	}

}

class MyThread1 extends Thread{
	
	public void run() {
		Thread th=Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(th.getName()+" "+th.getThreadGroup());
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
