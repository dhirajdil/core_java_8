package Prep_2020.prep.Lamda;

import java.util.*;

class Product{
	int id;
	String name;
	float price;
	
	public Product(int id,String name,float price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
}

public class CompratorWithLamda {
		public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		list.add(new Product(1, "HP Laptop", 24000));
		list.add(new Product(3, "Accer Laptop", 34000));
		list.add(new Product(2, "Lenevo Laptop", 44000));
		list.add(new Product(5, "Dell Laptop", 14000));
		
		System.out.println("sorting on basich of name");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p:list) {
			System.out.println(p.id+" "+p.name+" "+p.price);  
		}
		}
}
