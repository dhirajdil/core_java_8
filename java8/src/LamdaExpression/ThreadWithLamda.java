package LamdaExpression;

public class ThreadWithLamda {
	public static void main(String[] args) {
		Runnable r1=()->{
			System.out.println("welcome in lamda");
		};
		Thread t1=new Thread(r1);
		t1.start();
		
	}

}
