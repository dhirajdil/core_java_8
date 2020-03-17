package DailyPractice;

import java.util.*;

public class Lab34 {
		public static void main(String[] args) {
			Std st=new Std(1,"A");
			Map<Std,String> map=new HashMap();
			new Std(1,"B");
			//map.put(new Emp(1,"A"),"dhiraj");
			//map.put(new Emp(1,"B"),"dhiraj");
		}
}

class Std{
	int roll;
	String name;
	
	
	
	 Std(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return roll;
	}
}
