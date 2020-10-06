package JavaTest;

public class Autoboxing {

	static void show() {
		System.out.println("Hello Test");
	}
	 
	
	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		
		System.out.println(x);
	    show();
	    
	   // Integer i =new Integer(y); //boxing
	      
	    Integer i=x;  // Autoboxing
	    System.out.println(i); 
	    
	    // int p= i.intValue(); //Unboxing
	     
	    int p=x ;//AutoUnboxing
	    System.out.println(p);
	    
	    
	    

	}

}
