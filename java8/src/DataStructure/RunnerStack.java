package DataStructure;

public class RunnerStack {
	public static void main(String[] args) {
		
		
		Stack nums=new Stack();
		nums.push(5);
		nums.push(8);
		nums.push(10);
//		nums.push(6);
//		nums.push(7);
//		nums.push(21);
		
		
		
		int num=nums.pop();
		System.out.println(num);
		nums.show();
		
		System.out.println(nums.size());
	}

}
