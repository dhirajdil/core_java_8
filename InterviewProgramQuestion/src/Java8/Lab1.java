package Java8;

interface Drawable{
	String draw(String nm);
}

public class Lab1 {
			public static void main(String[] args) {
				Drawable d=(name)->{
					return name;
				};
				String st=d.draw("dhiraj");
				System.out.println(st);
			}
}
