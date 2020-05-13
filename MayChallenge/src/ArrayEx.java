import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class ArrayEx {
	public static void main(String args[]) {
		 int[] s = {1,1,2,3,3};
			Integer a = solution(s);
			System.out.print(a);
		}

	private static Integer solution(int[] s) {
		//HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();	
		TreeMap<Integer,Integer>map= new TreeMap<Integer,Integer>();
		for(int i=0;i<s.length;i++) {
			map.put(i, s[i]);
		}
		Iterator iter = map.entrySet().iterator();
		return map.entrySet().iterator().next().getKey();
		}
		/*for(int i=0;i<s.length;i++) {
			if(map.get(s[i]) != null) {
			map.remove(s[i]);	
			}
			else {
				map.put(s[i], 1);			
			}
		}
		return map.entrySet().iterator().next().getKey();
	}*/
}
