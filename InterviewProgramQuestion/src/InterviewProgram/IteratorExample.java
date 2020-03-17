package InterviewProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String arg[]) {
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(20);

		Iterator it = list.iterator();

		int count = 0;
		while (it.hasNext()) {
//			if (count <5 )
//				System.out.println(it.next());
//				
//			else
				it.remove();
//			count++;
		}
	}
}
