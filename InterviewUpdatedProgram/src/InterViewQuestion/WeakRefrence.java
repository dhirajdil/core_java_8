package InterViewQuestion;

import java.lang.ref.WeakReference;

public class WeakRefrence {
	public static void main(String[] args) {
		Counter counter = new Counter();
		WeakReference<Counter> weakCounter = new WeakReference<Counter>(counter);

		counter = null;
		String str = "dhiraj";
		str = str + "kumar";
		System.out.println(str + "suman");
	}

}

class Counter {

}