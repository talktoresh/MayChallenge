
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String args[]) {
		int nums[] = {2, 1, 7, 11, 15};
		int target = 9;
		int pair[]=Solution(nums, target);
		System.out.println(pair[0]+" "+pair[1]);
	}
	    public static int[] Solution(int[] nums, int target) {
	    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    	
	    	for(int i =0;i<nums.length;i++) {
	    		int complement = target - nums[i];
	    		if(map.containsKey(complement)) {
	    			return new int[] {i,map.get(complement)};
	    		}
	    		else
	    			map.put(nums[i], i);
	    	}
	    	throw new IllegalArgumentException("No two sum solution");
	    }
}

