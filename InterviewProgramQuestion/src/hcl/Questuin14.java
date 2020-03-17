package hcl;

public class Questuin14 implements Runnable{
	public void run() {
		System.out.println("3");
	}
	public static void main(String[] args) throws InterruptedException {
		Thread th=new Thread(new Questuin14());
		th.start();
		System.out.println(1);
		th.join();
		System.out.println(2);
		
	}

}
