package Prep_2020.prep.Lamda;



public class Lab6 {
	public static void main(String[] args) {
	Runnable r=()->{
		System.out.println("thread is running......");
	};
	Thread th=new Thread(r);
	th.start();
	}

}
