
public class StringCheck {
	public static void main(String args[]) {
		String S="a#c#"; 
		String T="a#c#"; 
			Boolean a = backspaceCompare(S,T);
			System.out.println(a);
		}
	public static boolean backspaceCompare(String S, String T) {
		char hash = '#';
		String a = "";
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)==hash) 
				S=S.replace(S.substring(i-1, i), "");
			if(T.charAt(i)==hash) 
				T=T.replace(T.substring(i-1, i), "");
		  }
				System.out.println(S+"  "+T);	

		if(S==T) {
			return true;
		}
		return false;
		
	}
}
