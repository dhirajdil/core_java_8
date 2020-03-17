package Prep_2020.prep.Lamda;

interface B{
	public int add(int a,int c);
}

public class Lab4 {
		public static void main(String[] args) {
			B b=(a,c)->{
				return a+c;
			};
			System.out.println(b.add(10, 20));
		}
}
