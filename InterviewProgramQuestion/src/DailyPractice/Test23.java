package DailyPractice;

public class Test23 {
	public static int searchBinary(int b[],int first,int last,int key) {
		int mid=(first+last)/2;
		while(first<last) {
			if(key>b[mid]) {
				first=mid+1;
			}else if(b[mid]==key) {
				System.out.println("element found in "+mid+"position");
			}else {
				last=mid-1;
				
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("element not found");
		}
		return key;
	}
	public static void main(String[] args) {
		int a[]= {1,3,4,5,6,7,9};
		int first=0;
		int last=a.length-1;
		int key=6;
		searchBinary(a,first,last,key);
	}

}
