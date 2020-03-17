package DailyPractice;

public class Test4 {
	public static void main(String[] args) {
		int a=9;
		char c=10;
		
		int a[]={2,4,5,6,8,19,20};
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				if(a[i]>max){
					max=a[i];
					
				}
			}
		}
		System.out.println(max);
	}

}
