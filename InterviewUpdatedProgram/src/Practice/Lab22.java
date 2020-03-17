package Practice;



public class Lab22 {
	public int hash_code(int[] input){
		int a = 0;
		int output[] = null;
		int len=input.length;
		for(int i=0;i<len;i++){
			System.out.println(input[i]);
			 a=output[a-1];
		}
		return a;
	}
	public static void main(String[] args) {
		int a[]={1,3,6,24,8,};
		Lab22 lb=new Lab22();
		
		System.out.println(lb.hash_code(a));
		
	}

}
