package InterviewProgram;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Printjob implements Runnable{
	String name;
	Printjob(String name){
	this.name=name;
	}
	public void run(){
	System.out.println(name+"...job started by thread"+Thread.currentThread().getName());
	try{
	Thread.sleep(5000);
	}catch(Exception e){
	System.out.println(name+"...job completed by thread"+Thread.currentThread().getName());
	}
	}
	}
//type of blocking Queue:-
//1.ArrayBlockingQueue
//2.DelayQueue
//3.LinkedBlockingDeque
//4.LinkedBlockingQueue
//5.LinkedTransferQueue
//6.PriorityBlockingQueue
//7.SynchronousQueue
class ExecutorDemo{
	public static void main(String args[]){
	Printjob[] jobs={new Printjob("durga"),
			 new Printjob("ravi"),
	 		 new Printjob("shiva"),
	         new Printjob("pavan"),
	         new Printjob("suresh"),
	         new Printjob("Anil")
			};
	ExecutorService service=Executors.newFixedThreadPool(3);
	for(Printjob job:jobs){
	service.submit(job);
	}
	service.shutdown();
	}
	}