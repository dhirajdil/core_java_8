package datastructure;

public class TNStackClient {
		
	
	public static void main(String[] args) {
		TNStack tns=new TNStack(3);
		if(!tns.isFull())
			tns.push(4);
		if(!tns.isFull())
		    tns.push(5);
		 if(!tns.isFull()) 
			 tns.push(3);
		 if(!tns.isFull())
			 tns.push(6);
		 
		 else
			 //pop some element
		 if(tns.isEmpty())
			tns.pop();
		 if(tns.isEmpty())
			 tns.pop();
		 if(tns.isEmpty())
			 tns.pop();
		 else
			 System.out.println("Stack is empty, cannot pop element");
		 
		 //reinsert to verify peek method
		 if(tns.isFull())
			 tns.push(6);
		 
		 tns.peek();
		 tns.peek();
		 
		
		
	}

}
