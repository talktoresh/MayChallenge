import java.util.HashMap;
import java.util.Map;

public class Phone {
	private static String Solution(int i, int j, int k, int l, int m, int n) {

		String time = "";

		HashMap<Integer, Integer> timeMap = new HashMap<Integer, Integer>();

		timeMap.put(1, i);
		timeMap.put(2, j);
		timeMap.put(3, k);
		timeMap.put(4, l);
		timeMap.put(5, m);
		timeMap.put(6, n);

		time = time+findHr(timeMap);
		time = time+":"+findMin(timeMap);
		time = time+":"+findSec(timeMap);

		return time;

		}

		private static String findSec(HashMap<Integer, Integer> timeMap) {

		String sec = findSmallestWithMax(timeMap,5);

		sec = sec+findSmallestWithMax(timeMap,9);

		//System.out.println(sec);

		return sec;
		}

		private static String findMin(HashMap<Integer, Integer> timeMap) {

		String min = findSmallestWithMax(timeMap,5);

		min = min+findSmallestWithMaxAndLeft(timeMap,9,2,9);

		//System.out.println(min);

		return min;
		}

		private static String findHr(HashMap<Integer, Integer> timeMap) {

		String hr = findSmallestWithMax(timeMap,2);

		if(hr.equals(2))
		hr = hr+findSmallestWithMax(timeMap,3);
		else
		hr = hr+findSmallestWithMax(timeMap,9);

		//System.out.println(hr);

		return hr;
		}

		private static String findSmallestWithMax(HashMap<Integer, Integer> timeMap, int max) {

		int small = Integer.MAX_VALUE;
		int finalKey = 0;
		for(Map.Entry<Integer, Integer> entry:timeMap.entrySet()) {
		if(entry.getValue()!= -1 && entry.getValue() <= max && entry.getValue()<small) {
		small = entry.getValue();
		finalKey = entry.getKey();
		}
		}

		timeMap.put(finalKey, -1);   
		return small+"";
		}

		private static String findSmallestWithMaxAndLeft(HashMap<Integer, Integer> timeMap, int max,int count, int num ) {

		int small = Integer.MAX_VALUE;
		int finalKey = 0;
		for(Map.Entry<Integer, Integer> entry:timeMap.entrySet()) {
		if(entry.getValue()!= -1 && entry.getValue() <= max && entry.getValue()<small
		&& (countLeft(count,entry.getValue(),timeMap ) == true)) {
		small = entry.getValue();
		finalKey = entry.getKey();
		}
		}

		timeMap.put(finalKey, -1);
		return small+"";
		}

		private static boolean countLeft(int count, int num, HashMap<Integer, Integer> timeMap) {

		int totalCount = 0;

		for(Map.Entry<Integer, Integer> entry:timeMap.entrySet()) {
		if(entry.getValue() != -1 && entry.getValue() <= num) {
		totalCount++;
		}
		}

		boolean x = (count <= totalCount)?true:false;
		return x;
		}

}
