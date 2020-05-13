
public class StringExample {
	public static void main(String args[]) {
		 String s = "1:61:40";
			String a = solution(s);
			System.out.println(a);
		}

	private static String solution(String s) {
		String hr_in_12clock = changetohr(s);
		return hr_in_12clock;
	}

	private static String changetohr(String s) {
		String hr = s.split(":")[0];
		String min = ":"+s.split(":")[1];
		String sec = ":"+s.split(":")[2];
		Integer initial_hr = Integer.parseInt(hr);
		if(initial_hr > 12 && initial_hr <= 24) {
			initial_hr = initial_hr - 12;
			hr = initial_hr.toString()+min+sec+"PM";
			
		}
		else if(initial_hr < 12) {
			hr = initial_hr.toString()+min+sec+"AM";
		}
		else {
			hr = "NOT POSSIBLE";
		}
		return hr;
	}

}
