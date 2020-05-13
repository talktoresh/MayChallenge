import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
   public static void main(String args[])
   {
	   
	   LinkedList<Integer> ll = new LinkedList<Integer>();
	   ll.add(1);
	   ll.add(2);
	   ll.add(3);
	   middleNode(ll);
   }
   public static int middleNode(LinkedList ll) {
	   Iterator i = ll.iterator();
	   int size = ll.size();
	   if(size%2 != 0)
		  System.out.println(ll.get(size/2));
	   else
		  System.out.println(ll.get(size/2 + 1));  
	return 0;
	   
   }
}
