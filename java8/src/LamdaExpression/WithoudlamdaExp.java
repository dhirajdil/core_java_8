package LamdaExpression;

public class WithoudlamdaExp {
	public static void main(String[] args) {
		int len=10;
		Drawable dr=new Drawable() {
			
			@Override
			public void draw() {
				System.out.println(len);
				
			}
		};
		dr.draw();
	}

}

interface Drawable{
	public void draw();
}
