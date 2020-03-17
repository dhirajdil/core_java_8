package datastructure;

import java.util.Arrays;

public class ArrayList {
	private Object myStore[];
	private int actSize=0;
	
	public ArrayList(){
		myStore=new Object[10];
	}
	public Object  get(int index){
		if(index<actSize){
			return myStore[index];
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	public void add(Object obj){
//		System.out.println(myStore.length+"length");
		
		if(myStore.length-actSize<=5){
			increaseeListSize();
		}
		myStore[actSize++]=obj;
	}
	public Object Remove(int index){
		if(index<actSize){
			Object obj=myStore[index];
			myStore[index]=null;
			int tmp=index;
			while(tmp<actSize){
				myStore[tmp]=myStore[tmp+1];
				myStore[tmp+1]=null;
				tmp++;
				
			}
			actSize--;
			return obj;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	public int size(){
		return actSize;
	}
	public void increaseeListSize(){
		myStore=Arrays.copyOf(myStore, myStore.length*2);
		System.out.println(myStore.length);
		
	}
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Integer(2));
		al.add(new Integer(5));
		al.add(new Integer(7));
		
	}

}
