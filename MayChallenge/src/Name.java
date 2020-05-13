
	public class Name{
		 
	    private String firstName;
	    private String lastName;
	 
	    public Name(String fName, String lName){
	        this.lastName = lName;
	        this.firstName = fName;
	    }
	  
	    @Override
	    public boolean equals(Object o) {
	    
	    if(o instanceof Name) {
	
	    Name name = (Name)o;
	    	
	      if(name.firstName.equals(this.lastName)){
	        return true;
	      } 
	       return false; 
	    }
	    else
	    	return false;
	    }
	 
	    public static void main(String[] args) {
	    	Name name1 = new Name ("John", "Doe");
	    	Name name2 = new Name ("Schon", "Doe");
	    	Name name3 = name1;
	    	 
	    	
	    	
	    	System.out.println(name1 + " " + name3); // true/false ?false

	    	System.out.println(name1 == name2); // true/false ?false
	    	System.out.println(name1.equals(name2));// true
	    	System.out.println(name1 == name3);//true
		}
	// Question 2: Using the class above, what is the result of the follow lines of code?
	


}
