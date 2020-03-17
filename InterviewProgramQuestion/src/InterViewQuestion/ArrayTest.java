package InterViewQuestion;



import java.util.Arrays;

public class ArrayTest {
public static int mainCount=0;

public static void main(String[] args) {
    String prevItem = "";
    String[] array = {"name1","name1","name2","name2", "name2","Test3"};
    Arrays.sort(array);
  

    for(String item:array){
    	
        if(! prevItem.equals(item)){
            mainCount = 0;
            countArray(array, 0, item);
            prevItem = item;
        }
    }
}

private static void countArray(String[] arr, int currentPos, String item) {
    if(currentPos == arr.length){
        
	if(mainCount>1){
	 System.out.println(item + " " +  mainCount);
	}
        return;
    }
    else{
        if(arr[currentPos].toString().equals(item)){
            mainCount += 1;
        }
        countArray(arr, currentPos+1, item);
    }
  }
}