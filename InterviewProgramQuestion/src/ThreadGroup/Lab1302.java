package ThreadGroup;

public class Lab1302 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("Diksha");
		MyThread th1=new MyThread(tg,"jlc");
		MyThread th2=new  MyThread(tg,"Bangalor");
		th1.start();
		th2.start();
		
	}

}
class MyThread extends Thread{
	MyThread(ThreadGroup tg,String name){
		super(tg,name);
		start();
	}
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<20;i++) {
			System.out.println(t.getName()+" "+t.getThreadGroup());
		}
	}
}
