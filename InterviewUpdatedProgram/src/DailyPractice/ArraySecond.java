package DailyPractice;

public class ArraySecond{
	public static void main(String[] args) {
		int a[]={4,5,3,9,6,1,2,8};
		int len=a.length;
		int max=0;
		int n=0;
		for(int i=0;i<len;i++){
			if(a[i]>max){
				n=max;
				max=a[i];
			}else if(a[i]>n){
				n=a[i];
			}
			
		}
		System.out.println(max);
		System.out.println(n);
	
	}

}
