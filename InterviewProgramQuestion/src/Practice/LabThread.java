package Practice;

class LabThread{
	public static void main(String args[]){
	MyThread t1=new MyThread();
	MyThread t2=new MyThread();
	t1.start();
	//t2.start();
	for(int i=0;i<10;i++){
	System.out.println("manish");
	}
	}
	}
class MyThread extends Thread{
	public void run(){
	for(int i=0;i<10;i++){
	System.out.println("dhiraj");
	}
	}
	}