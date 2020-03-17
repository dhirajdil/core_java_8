package DailyPractice;

public class Lab31 {
	public static void main(String[] args) {
//		String[] array = {"name1","name1","name2","name2", "name2","Test3"};
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array.length;j++) {
//				System.out.println(array[i]);
//				System.out.println(array[j]);
//			}
//		}
		
		String a[]= {"1","2","3","4","5","6"};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i].equals(a[j])) {
					count++;
				}
			}
			
		}
		System.out.println(count);
	}

}
