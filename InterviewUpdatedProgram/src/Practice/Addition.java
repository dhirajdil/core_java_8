package Practice;

import java.util.*;
class Addition{
	public static void main(String args[]){
	List list1=new ArrayList();
	list1.add("dhiraj");
	list1.add("bihar");
	list1.add("mohan");
	list1.add("ramesh");
	list1.add("manish");
	List list2=new ArrayList();
//	list2.add("gya");
//	list2.add("patna");
//	list2.add("muzzafarpur");
//	list2.add("jehana");
//	list2.add("hazipur");
	
	list1.addAll(list2);
	System.out.println(list1);
	}
	}