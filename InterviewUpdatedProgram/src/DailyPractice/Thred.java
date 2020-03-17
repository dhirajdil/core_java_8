package DailyPractice;

import java.util.*;

class Thred{
	public static void main(String args[]){
	List list=new ArrayList();
	list.add(1);
	list.add(3);
	list.add(5);
	list.add(7);
	
	MyThread th1=new MyThread();
	MyThread th2=new MyThread();
	th1.start();
	//7th2.start();
	for(int i=0;i<list.size();i++){
	System.out.println(list.get(i));
	try{
	Thread.sleep(500);
	}catch(Exception e){
	e.printStackTrace();
	}
	}
	}
	}
class MyThread extends Thread{
	public void run(){
	List list=new ArrayList();
	list.add(2);
	list.add(4);
	list.add(6);
	list.add(8);
	Thread th=Thread.currentThread();
	for(int i=0;i<list.size();i++){
	System.out.println(list.get(i));
	try{
	Thread.sleep(500);
	}catch(Exception e){
	e.printStackTrace();
	}
	}
	}
	}
