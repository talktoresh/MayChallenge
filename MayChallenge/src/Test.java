class Test 
{ 
     // static variable 
     int a = 10; 
     int b; 
      
    // static block 
  
    public static void main(String[] args) 
    { 
		/*
		 * Test obj = new Test(); System.out.println("from main");
		 * System.out.println("Value of a : "+obj.a);
		 * System.out.println("Value of b : "+obj.b);
		 */
    	
    	Test t1 = new Test();
    	Test t2 = new Test();
    	
    	System.out.println(t1.a);
    	System.out.println(t2.a);
    	
    	t1.a = 20;
    	
    	System.out.println(t2.a);
    	
    	
    } 
    static { 
        System.out.println("Static block initialized."); 
      //  b = a * 4; 
    } 
  
} 
