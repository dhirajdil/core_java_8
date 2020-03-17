package DataStructure.Recursive;

//binary search algorithm will work in only sorted array

//public class BinarySearch {
//	public static void binarySearch(int arr[],int first,int last,int key) {
//		int mid=(first+last)/2;
//		while(last>=first){
//			if(arr[mid]<key) {
//				first=mid+1;
//			}else if(arr[mid]==key){
//				System.out.println("Element is found on index"+mid);
//				break;
//			}else {
//				last=mid-1;
//			}
//			mid=(first+last)/2;
//			
//		}
//		if(first>last) {
//			System.out.println("element is not found");
//		}
//	}
//	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5,6,7,8,9};
//		int last=a.length-1;
//		int key=7;
//		int first=0;
//		
//		binarySearch(a,first,last,key);
//		
//	}
//
//}

class BinarySearch{
	public static void searchKey(int arr[],int first,int last,int key){	
	int mid=(first+last)/2;
	while(first<=last){
	if(arr[mid]<key){
	first=mid+1;
	}else if(arr[mid]==key){
	System.out.println("element id found in"+mid);
	break;
	}else{
	last=mid-1;
	}
	  mid = (first + last)/2;
	}
//	  if ( first > last ){  
//	      System.out.println("Element is not found!");  
//	   }  
	}
	public static void main(String args[]){
	int a[]={10,20,30,40,50,50,70};
	int last=a.length-1;
	int first=0;
	int key=20;
	searchKey(a,first,last,key);
	}
	
	}
