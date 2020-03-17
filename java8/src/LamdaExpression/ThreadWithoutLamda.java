package LamdaExpression;

public class ThreadWithoutLamda {
	public static void main(String[] args) {
	
	
		
	MyThread th1= new MyThread();
	MyThread th2= new MyThread();
	
	th1.start();
	th2.start();
	
	
	
	
	}

}
class MyThread extends Thread{
	public void run() {
		System.out.println("welcome in thread");
	}
}
