import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ranSomNote {
	public static void main( String args[]) {
       String ransomNote = "aa", magazine = "ab";
       System.out.println(canConstruct(ransomNote,magazine));       
	}


 public static boolean canConstruct(String ransomNote, String magazine) {
	Map<Character,Integer> map = new HashMap<Character, Integer>();
	int flag =0;
		for(int i=0;i<magazine.length();i++) {
			if(map.get(magazine.charAt(i))!= null) {
				map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
			}
			else
				map.put(magazine.charAt(i),1);
		}
	   for(int i=0;i<ransomNote.length();i++) {
		   if(map.get(ransomNote.charAt(i))==flag){
               map.remove(ransomNote.charAt(i));
           }
		   if(map.containsKey(ransomNote.charAt(i))) {
			  map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
		   }
		   else
			   return false;
	   }
	return true; 


 }
 
}