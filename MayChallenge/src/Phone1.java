import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phone1 {
	public static void main(String[] args) {
		System.out.println(Solution(2,1,3,7,8,9));
		
	}
	//atleast 3 values less than five else not possible

	private static String Solution(int i, int j, int k, int l, int m, int n) {

		String time = "";

		HashMap<Integer, Integer> timeMap = new HashMap<Integer, Integer>();

		timeMap.put(1, i);
		timeMap.put(2, j);
		timeMap.put(3, k);
		timeMap.put(4, l);
		timeMap.put(5, m);
		timeMap.put(6, n);
        time = findSolution(timeMap);
	
		return time;

		}

	private static String findSolution(HashMap<Integer, Integer> timeMap) {
		int maxhr = 24;
		int min = 00;
		int maxminsec = 60;
		int value =0;
		int max =0;
		List<Integer> myhrList = new ArrayList<Integer>();
		List<Integer> myminList = new ArrayList<Integer>();
		List<Integer> mysecList = new ArrayList<Integer>();
	
        for(int i =1;i<7;i++) {
        	for(int j =1;j<7;j++) {
        		value = (timeMap.get(i)*10)+timeMap.get(j);
        		if(value<maxhr && i!=j) {
        			myhrList.add(value);
        		}
        		if(value<maxminsec && i!=j) {
        			myminList.add(value);
        			mysecList.add(value);
        		}
        	}
        }
        int flag = -1;
       System.out.println(mysecList);
       int sec = getList(mysecList,flag);
       int minute = swap(getList(myminList,sec)); 
	   int hr = swap(getList(myminList,minute)); 
	   if(hr>24 || minute >60) {
		   System.out.println("NOT POSSIBLE");
	   }
	   else
		System.out.println(hr +"  "+minute+ " "+sec);
		return null;
	}

	private static int swap(int original) {
        System.out.println(original);

		int value = original;
		int reversed =0;
		while(value != 0) {
            int digit = value % 10;
            reversed = reversed * 10 + digit;
            value /= 10;
        }
        System.out.println(reversed);
        if(original > reversed)
        	
        	return reversed;
        return original;
		
	}

	private static int getList(List<Integer>myList, int flag) {
		int max =0;
		int rev = 0;
		List<Integer> removeList = new ArrayList<Integer>();
		if(flag!=-1) {
			int digit = flag % 10;
            flag /= 10;
            
            for(int i =0;i<myList.size();i++)
            {
            	if(myList.get(i)%10 ==digit || myList.get(i)/10 ==digit || myList.get(i)%10 ==flag ||myList.get(i)/10 ==flag) {
            		removeList.add(new Integer(myList.get(i)));
            	}
            }
            myList.removeAll(removeList);
          //  System.out.println(myList);
		}
		for(int i=0;i<myList.size();i++) {        
	        	if(myList.get(i)>max) {
	        		max = myList.get(i);
	        	}
	        } 
	     //  System.out.println(max);
	        return max;
		
	}

	
}
	
