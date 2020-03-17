package DataStructure;

public class ArrayList {
	
	int a[]=null;
	ArrayList(){
		a=new int[10];
	}
 
	int top=0;
	void add(int data) {
		a[top]=data;
		top++;
	}
 public void show() {
	 for(int i=0;i<a.length;i++) {
		 if(a[i]!=0)
		 System.out.println(a[i]);
	 
	 }

 }
 public void get(int index) {
	 int data;
	 data=a[index-1];
	 System.out.println(data);
 }
 public void size() {
	 System.out.println("size of arraylistis:"+top);
 }
 

}
