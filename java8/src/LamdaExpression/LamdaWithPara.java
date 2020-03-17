package LamdaExpression;

public class LamdaWithPara {
	public static void main(String[] args) {
		Employee emp=(int pay)->{
			System.out.println(pay);
		};
		emp.pay(10000);
	}

}
interface Employee{
	void pay(int pay);
}
