package DataStructure.Recursive;

public class Factorial {
	public static void main(String[] args) {
	 int fact=factNum(5);
	 System.out.println(fact);
	}
    
  static int factNum(int j) {
	   int fact=1;
	   for(int i=1;i<=j;i++) {
		   fact=fact*i;
	   }
		return fact;
	}
}
