import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Firstclass {
	public static void main(String args[]) {
     String s = "00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090\n00:08:00,400-234-099";
		int a = solution(s);
		System.out.println(a);
	}
	
	private static int totaltime(String s) {
		    String[] hourMin = s.split(":");
		    int hour = Integer.parseInt(hourMin[0]);
		    int mins = Integer.parseInt(hourMin[1]);
		    int sec = Integer.parseInt(hourMin[2]);
		   // int hoursInMins = hour * 60;
		    int value;
		   // int valuearr[];
		    int totalmins;
		    if(mins<5) {
		    	totalmins = mins*60 + sec;
		    	value = totalmins*3;
		    	//System.out.println(value);
		    }
		    else {
		    	if(sec!=0) {
		    	 totalmins = mins+1;
		    	}
		    	else
		    	totalmins = mins;
		    	value = totalmins*150;
		    	//System.out.println(value);
		    }
			return value;
		    
		    
	}

	private static int solution(String s) {	
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		//System.out.print(a);
		int maxvalue = 0;
	     int totalbill = 0;


		String []lines = s.split("\n");
		
		ArrayList<Integer> value = new ArrayList<Integer>();
		ArrayList<Integer> replacedphoneArray = new ArrayList<Integer>();
		ArrayList<String> time = new ArrayList<String>();
		ArrayList<String> phoneArray = new ArrayList<String>();
		
		for(int i =0;i<lines.length;i++) {
			time.add(lines[i].split(",")[0]);
			phoneArray.add(lines[i].split(",")[1]);
		}
		
		//System.out.println(time.get(1)+">>>>>"+phoneArray.get(1));
		
		
		//System.out.println(line[0]);
		for(int i=0;i<lines.length;i++) {

			replacedphoneArray.add(Integer.parseInt(phoneArray.get(i).replaceAll("\\D", "")));

			value.add(totaltime(time.get(i)));
			//System.out.println(value[i]);
			if(map.containsKey(replacedphoneArray.get(i)))
				map.put(replacedphoneArray.get(i), map.get(replacedphoneArray.get(i))+value.get(i));
			else
				map.put(replacedphoneArray.get(i), value.get(i));
			
		}
		//iterate hashmap to get total bill - maxoffer
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()>maxvalue) {
				maxvalue = entry.getValue();
			}
			totalbill+=entry.getValue();
			
		}
		totalbill = totalbill-maxvalue;
		return totalbill;
	}
}

