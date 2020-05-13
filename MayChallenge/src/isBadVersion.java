
public class isBadVersion {
    static int version = 4;
    static int base = 0;
	public static void main(String args[]) {

		System.out.println(firstBadVersion(5));
	}
    public static int firstBadVersion(int n) {
    	int bad =n;
    	boolean isbad = true;
        int mid = (base+n)/2;
        if(isBadVersion1(mid)){
            n = mid-1;
            if(n==1)
            	return mid;
            firstBadVersion(n);
        }
        else{
            base = mid+1;
            firstBadVersion(n);
            
        }
              
        return bad;
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
//        boolean isbad = true;
//        int bad = n;
//        while(n>0){
//           isbad = isBadVersion1(n/2); 
//           if(isbad == true) {        
//               bad = n/2;
//               firstBadVersion(n/2);
//           }
//           else
//           {
//               bad =(n/2)+1; 
//               for(int i=(n/2)+1;i<=n;i++){
//                   isbad = isBadVersion1(i); 
//                   if(isbad == true){
//                       return i;
//                   }
//               }
//           }
//             
//           }
//        return bad;
              
    }
	private static boolean isBadVersion1(int i) {
		if(i>=version)
			return true;
		return false;
	}
}

