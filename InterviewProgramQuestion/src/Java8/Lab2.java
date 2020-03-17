package Java8;

import java.util.*;

public class Lab2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("dhiraj");
		list.add("manish");
		list.add("ravi");
		list.add("mohan");
		
		list.forEach(
				n->System.out.println(n)
				);
	}

}
