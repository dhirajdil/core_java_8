package LamdaExpression;

public class LambdaExpMultipleStatement {
	public static void main(String[] args) {
		Multiplestate mul=(String saysomething)->{
			String st1="hyderabad";
			String st2=saysomething+st1;
			return st2;
		};
		System.out.println(mul.say("i am dhirah kumar working in "));
		}

}
interface Multiplestate{
	String say(String saysomething);
}
