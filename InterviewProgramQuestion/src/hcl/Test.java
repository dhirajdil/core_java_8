package hcl;

public class Test {
	private static int value=20;
	public int s=15;
	public static int temp=10;
	public static class Nested{
		private void display() {
			System.out.println(temp+s+value);
		}
	}
	public static void main(String[] args) {
		Test.Nested inne=new Test.Nested();
		inne.display();
	}

}
