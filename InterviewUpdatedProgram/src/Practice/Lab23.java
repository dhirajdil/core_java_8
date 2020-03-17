package Practice;

import java.util.*;

public class Lab23 {
		public static void main(String[] args) {
			List<Employee> list =new ArrayList<Employee>();
			list.add(new Employee(10,"dhiraj","dhiraj@gmail.com"));
			list.add(new Employee(11,"mohan","dhiraj@gmail.com"));
			list.add(new Employee(12,"pamda","dhiraj@gmail.com"));
			list.add(new Employee(13,"ravi","dhiraj@gmail.com"));
			list.add(new Employee(14,"kishor","dhiraj@gmail.com"));
			list.add(new Employee(15,"ramesh","dhiraj@gmail.com"));
			list.add(new Employee(16,"vibek","dhiraj@gmail.com"));
			list.add(new Employee(17,"manish","dhiraj@gmail.com"));
			
			
			ListIterator it=list.listIterator();
			while(it.hasNext()){
				Object obj=it.next();
				System.out.println(obj);
				if(obj.equals(15)){
					it.remove();
				}
						
			}
		}
}

class Employee{
	int sid;
	String name;
	String email;
	
	Employee(int sid,String name,String email){
		this.sid=sid;
		this.name=name;
		this.email=email;
	}
	public String toString(){
		return sid+" "+name+" "+email;
	}
}