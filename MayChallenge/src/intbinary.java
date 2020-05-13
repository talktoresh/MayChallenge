
public class intbinary {
   public static void main(String args[]) {
	   System.out.println(findComplement(1));
   }
	public static int findComplement(int num) {
		 int ones = (Integer.highestOneBit(num) << 1) - 1;
		    return num ^ ones;  
	    }
}
