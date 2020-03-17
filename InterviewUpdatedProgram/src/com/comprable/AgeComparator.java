package com.comprable;

import java.util.Comparator;

public class AgeComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		if(obj1 instanceof Student && obj2 instanceof Student) {
			Student st1=(Student)obj1;
			Student st2=(Student)obj2;
			return st1.age-st2.age;
//			if(st1.age==st2.age)  
//				return 0;  
//				else if(st1.age>st2.age)  
//				return 1;  
//				else  
//				return -1;  
		}
		return 0;
	}

	

}
