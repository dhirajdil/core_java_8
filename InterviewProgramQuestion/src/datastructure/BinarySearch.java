 package datastructure;

public class BinarySearch {
	public static void searchElement(int a[],int key,int first,int last){
		int mid=(first+last)/2;
		while(first<=last){
			if(a[mid]<key){
				first=mid+1;
			}else if(a[mid]==key){
				System.out.println("Element found on index="+mid);
			}else{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last){
			System.out.println("Element is not found");
		}
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9};
		int key=6;
		int first=0;
		int last=a.length-1;
		searchElement(a,key,first,last);
	}

}
