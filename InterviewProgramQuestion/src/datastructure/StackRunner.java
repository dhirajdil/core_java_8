package datastructure;

public class StackRunner {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(5);
		st.push(6);
		st.push(2);
		st.push(10);
		
		st.show();
		System.out.println(st.pop());
		System.out.println(st.peek());
	}

}
