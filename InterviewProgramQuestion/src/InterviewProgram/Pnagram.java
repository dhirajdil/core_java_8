package InterviewProgram;

import java.util.HashSet;  
import java.util.Set;  
  
/** 
 * @author Amit Gupta 
 * 
 */  
public class Pnagram {  
  
    private final Set missingLetters = new HashSet();  
  
    public Pnagram(String s) {  
        for (char ch = 'a'; ch <= 'z'; ch++) {  
            missingLetters.add(ch);  
        }  
        s = s.toLowerCase();  
        for (int i = 0; i < s.length(); i++) {  
            missingLetters.remove(s.charAt(i));  
        }  
    }  
  
    public boolean isPangram() {  
        return missingLetters.isEmpty();  
    }  
  
    public Set getMissingAlphabets() {  
        return new HashSet<>(missingLetters);  
    }  
      
    public static void main(String[] str){  
        String sentence1 = "The quick brown fox jumps over the lazy dog";  
        Pnagram p1 = new Pnagram(sentence1);  
        if(p1.isPangram()){  
            System.out.println("Given sentence is pangram");  
        }else{  
            System.out.println("Given sentence is not pagram");  
        }  
    }  
}  

