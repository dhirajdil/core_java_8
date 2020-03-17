package InterViewQuestion;

public class MyTest {
	public static void main(String[] args) {
		/*int ab=98;
		System.out.println("in main before"+ab);
		MNO mno = new MNO();
		mno.showValue(ab);
		System.out.println("in main after"+ab);*/
		subb s=new subb();
		System.out.println(s.x);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);
	}

}

class MNO{
	void showValue(int ab)
	{
		System.out.println(ab);
		if(ab!=0)
			showValue(ab/10);
		System.out.println(ab);
	}
}

class superr{
	final int x=10;
}
class subb extends superr{
	int y=20;
}