import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Queue;

public class uniqueChar {
	 public static void main(String args[]) {
		   System.out.println(firstuniq("loveleetcode"));
	   }

	private static int firstuniq(String magazine) {
		Map<Character,Integer> map = new LinkedHashMap<Character, Integer>();
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i=0;i<magazine.length();i++) {
			if(map.get(magazine.charAt(i))!= null){
				map.remove(magazine.charAt(i));
				list.add(magazine.charAt(i));
			}
			else if(list.contains(magazine.charAt(i))==false)
				map.put(magazine.charAt(i),i);
	    
		}
		
		if(map.isEmpty())
			return -1;
		else
			return map.entrySet().iterator().next().getValue();
		
	}


}
