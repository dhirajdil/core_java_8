package DailyPractice;

public class Lab2{
	public static void main(String[] args) {
		int a[]={1,4,2,2,5,6,6};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]!=a[j]){
					System.out.println(a[i]);
				}
			}
		}
	}

}
