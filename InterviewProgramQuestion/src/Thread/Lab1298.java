package Thread;

class Lab1298 {
	public static void main(String[] args) {
		MyThread3 th1=MyThread3("bihar");
		MyThread3 th2=MyThread3("patna");
		th1.start();
		th2.start();
	}

}

class MyThread3 extends Thread{
	MyThread3(String st){
		super(st);
		start();
	}
	public void run() {
		Thread t=Thread.currentThread();
		for(int i=0;i<10;i++) {
			System.out.println(t.getName()+" "+t.getThreadGroup());
		}
		
	}
}
