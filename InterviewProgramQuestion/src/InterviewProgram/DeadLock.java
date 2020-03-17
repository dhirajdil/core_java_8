package InterviewProgram;



class A{
	public synchronized  void d1(B b){
	System.out.println("Thread start executing of d1() method");
	try{
	Thread.sleep(5000);
	}catch(Exception e){
	System.out.println("Thread start executing of d1() lastmethod");
	b.last();
	}
	}
	public synchronized  void last(){
	System.out.println("invalid A last() method");
	}
	
	
	}
class B{
	public synchronized  void d2(A a){
	System.out.println("Thread start executing of d2() method");
	try{
	Thread.sleep(5000);
	}catch(Exception e){
	System.out.println("Thread start executing of d1() lastmethod");
	a.last();
	
	}
	}
	
	public synchronized  void last(){
	System.out.println("invalid B last() method");
	}
	}

class  DeadLock extends Thread{
	A a=new A();
	B b=new B();
	public void m1(){
	this.start();
	a.d1(b);
	}
	public void run(){
	b.d2(a);
		}
	public static void main(String args[]){
	DeadLock t=new DeadLock();
	t.start();
	}
	}
