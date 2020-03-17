package LamdaExpression;

public class WithLamdaExp {
         public static void main(String[] args) {
			int wid=10;
        	 Drawablee d2=()->{
        		 System.out.println(wid);
        	 };
        	 d2.drwa();
		}
}

interface Drawablee{
	void drwa();
}
