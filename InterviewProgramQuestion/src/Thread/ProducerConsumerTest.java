package Thread;

public class ProducerConsumerTest {
	public static void main(String[] args) {
		CubbyHole c=new CubbyHole();
		Producer p1=new Producer(c, 1);
		Consumer c1=new Consumer(c, 1);
		p1.start();
		c1.start();
	}

}

class CubbyHole{
	private int contents;
	private boolean available=false;
	
	public synchronized int get() {
		while(available==false) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		available =false;
		notifyAll();
		return contents;
		
	}
	public synchronized void put(int value) {
		while(available==true) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		available=true;
		contents=value;
		notifyAll();
		
	}
}

class Consumer extends Thread{
	CubbyHole cubbyhole;
	private int number;
	Consumer(CubbyHole cubbyhole,int number){
		this.cubbyhole=cubbyhole;
		this.number=number;
	}
	public void run() {
		int value=0;
		for(int i=0;i<10;i++) {
			value =cubbyhole.get();
			System.out.println(value+"t"+this.number);
		}
	}
	
}
class Producer extends Thread{
	CubbyHole cubbyhole;
	int number;
	Producer(CubbyHole cubbyhole,int number){
		this.cubbyhole=cubbyhole;
		this.number=number;
		
	}
	public void run() {
		for(int i=0;i<10;i++) {
			cubbyhole.put(i);
			
			try {
	            sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) { }
		}
	}
}