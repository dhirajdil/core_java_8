package InterviewProgram;

import java.util.concurrent.atomic.AtomicLong;

class EvenOdd{
	public static void main(String[] args) {
		AtomicLong num=new AtomicLong();
		Object lock=new Object();
		Even ev=new Even(num,lock);
		Odd od=new Odd(num,lock);
		ev.start();
		od.start();
		
	}
}
class Even extends Thread{
	private AtomicLong num;
	private Object lock;
	Even(AtomicLong  num,Object lock){
		this.num=num;
		this.lock=lock;
	}
	public void run() {
		synchronized (lock) {
			while(true) {
				if(num.get()%2!=0) {
					try {
						lock.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}else {
					System.out.println("Even"+num);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					num.incrementAndGet();
					lock.notifyAll();
				}
			}
			
		}
	}
	
}
class Odd extends Thread{
	private AtomicLong num;
	private Object lock;
         Odd(AtomicLong  num,Object lock){
		 this.num=num;
		 this.lock=lock;
	}
         
     public void run() {
    	 synchronized (lock) {
			while(true) {
				if(num.get()%2==0) {
					try {
						lock.wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}else {
					System.out.println("Odd"+num);
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					num.incrementAndGet();
					lock.notifyAll();
				}
			}
		}
     }
}