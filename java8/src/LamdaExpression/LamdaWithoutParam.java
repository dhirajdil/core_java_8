package LamdaExpression;

public class LamdaWithoutParam {
				public static void main(String[] args) {
			     Retu ret=()->{
			    	return "my name is dhiraj"; 
			     };
			    System.out.println(ret.retur());
				}
}

interface Retu{
	String retur();
}
