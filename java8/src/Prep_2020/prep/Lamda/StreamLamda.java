package Prep_2020.prep.Lamda;

import java.util.*;
import java.util.stream.Stream;

class Laptop{
	int id;
	String name;
	float price;
	public Laptop(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

public class StreamLamda {
	public static void main(String[] args) {
		List<Laptop> list=new ArrayList<Laptop>();
		list.add(new Laptop(1, "HP Laptop", 30000));
		list.add(new Laptop(2, "Dell Laptop", 40000));
		list.add(new Laptop(3, "Lenovo Laptop",50000));
		list.add(new Laptop(4, "Accer Laptop", 60000));
		list.add(new Laptop(5, "Apple Laptop", 70000));
		
		Stream<Laptop> filterdata=list.stream().filter(p->p.price>40000);
		filterdata.forEach(
				(n)->System.out.println(n.id+"\t"+n.name+"\t"+n.price)
				);
	}

}
