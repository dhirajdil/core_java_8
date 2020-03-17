package InterViewQuestion;

 class Synchro{
	 public static void main(String[] args) {
		Monkey mo1=new Monkey();
		Monkey mo2=new Monkey();
		MyThread th1=new MyThread(mo1);
		MyThread th2=new MyThread(mo2);
		th1.start();
		th2.start();
		
	}
	 
 }



 class MyThread extends Thread{
	Monkey mon=null;
	MyThread(Monkey mon){
		this.mon=mon;
	}
	public void run(){
		mon.show();
	}
}
class Monkey{
	synchronized void show(){
	Thread th=Thread.currentThread();
	for(int i=0;i<10;i++){
		System.out.println(th.getName());
		try{
			Thread.sleep(500);
		}catch(Exception e){
			
		}
	}
	}
	
}