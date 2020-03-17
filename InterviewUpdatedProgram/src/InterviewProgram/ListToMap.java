package InterviewProgram;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ(1,"one"));
		list.add(new Employ(2,"two"));
		list.add(new Employ(3,"three"));
		list.add(new Employ(4,"four"));
		
		list.forEach(item->System.out.println(item));
		
		Map<Integer,Employ> map=new HashMap<Integer,Employ>();
		map=list.stream().collect(Collectors.toMap(item->item.getId(), item->item));
		map.forEach((k,v)->System.out.println(k+"="+v));
		
	}

}

class Employ{
	int id;
	String name;
	public Employ(int id, String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id+","+name;
	}
}