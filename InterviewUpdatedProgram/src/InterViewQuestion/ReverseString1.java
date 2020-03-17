package InterViewQuestion;

public class ReverseString1 {
	public static void main(String[] args) {
		String st = "dhiraj kumar is a bad boy";
		String st1 = st.substring(0, 6);
		System.out.println(st1);
		String st2 = st.substring(7, 13);
		System.out.println(st2);
		String st3 = st.substring(15, 17);
		System.out.println(st3);
		String st4 = st.substring(17, 19);
		System.out.println(st4);

		System.out.println(st4 + " " + st3 + " " + st2 + " " + st1);
	}

}
