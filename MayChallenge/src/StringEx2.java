import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringEx2 {
	public static void main(String args[]) {
		 String name = "Scala"; //1st String object
		 String name_1 = "Scala"; //same object referenced by name variable
		 String name_2 = new String("Scala"); //different String object
		 String arr[] = {"a","b","c","c","c","c","c","c","c","c","c","c","c","a","a","a","b","b","b","b","b"};
		 ArrayList<String> a = solution(arr);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		 
		String str = "Java is best programming language";
	    
		//this will return part of String str from index 0 to 12
		String subString = str.substring(0,1);
		    
		System.out.println("Substring: " + subString);
		 //this will return true
		 if(name==name_1){
		 System.out.println("both name and name_1 is pointing to same string object");
		 }

		 //this will return false
		 if(name==name_2){
		 System.out.println("both name and name_2 is pointing to same string object");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		}

	private static ArrayList<String> solution(String[] arr) {
		ArrayList<String> arr1 = new ArrayList<String>();
		HashMap<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<arr.length;i++) {
        	  int count =1;
        	if(map.get(arr[i]) != null)
        	   map.put(arr[i], map.get(arr[i])+1);
        	else
        		map.put(arr[i], count);
        }
        while(map.size()!=0) {
			int maxvalue = 0; String max = null;

		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			
		   if(entry.getValue()>maxvalue) {
			   maxvalue =entry.getValue();
			   max = entry.getKey();
		   }
		}
		arr1.add(max);
		map.remove(max);
		
        }
		return arr1;
	}
}


