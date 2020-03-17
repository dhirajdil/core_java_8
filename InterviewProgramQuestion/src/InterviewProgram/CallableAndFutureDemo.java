package InterviewProgram;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFutureDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService s=Executors.newSingleThreadExecutor();
		System.out.println("submiting task to call factorial of 10");
		Future resultOfFact=s.submit(new Factorialcal(10));
		long resultOfFact10=(long)resultOfFact.get();
		System.out.println("factorial of 10 is"+resultOfFact10);
		s.shutdown();
	}

}

class Factorialcal<V> implements Callable<V>{
	private int num;
	Factorialcal(int num){
		this.num=num;
	}
	@Override
	public Long call() throws Exception {
	long result =1;
	while(num!=0) {
		result=result*num;
		num=num-1;
		Thread.sleep(500);
	}
	return result;
	}
	
}
