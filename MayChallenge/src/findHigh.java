import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class findHigh {
	 public static void main(String args[]) {
		 int nums[] = {1,1,1,2,2,2,2,2,2,3,4,2,1,1};
		   System.out.println(majorityElement(nums));
	   }

	 public static int majorityElement(int[] nums) {
	        int count = nums.length/2;
	        int element = nums[0];
	        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
			for(int i=0;i<nums.length;i++) {
			   if(map.get(nums[i]) != null){
	               map.put(nums[i],map.get(nums[i])+1);
	           }
			   else
				  map.put(nums[i],1);
			   }
			for(int i = 0;i<nums.length;i++) {
				for(Entry<Integer, Integer> entry:map.entrySet()) {
				if(entry.getValue()>=count) {
					count = entry.getValue();
					element = entry.getKey();
				}
			}
	    }
			return element;	
}
}
