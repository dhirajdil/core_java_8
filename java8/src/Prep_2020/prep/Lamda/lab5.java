package Prep_2020.prep.Lamda;

import java.util.*;

public class lab5 {
		public static void main(String[] args) {
			List list=new ArrayList();
			list.add("dhiraj");
			list.add("manish");
			list.add("bihar");
			list.add("patna");
			list.add("hyderabad");
			list.add("telangana");
			
			list.forEach(
					(n)->System.out.println(n)
					
					);
		}
}
