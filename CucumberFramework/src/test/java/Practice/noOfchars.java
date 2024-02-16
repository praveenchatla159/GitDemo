package Practice;

public class noOfchars {
	
	
	public static void m2() {
		String s = "Count, the number,, of commas."; 
		 int numberOfCommas = s.replaceAll("[^,]","").length(); 
		 
		 System.out.println(numberOfCommas);

	}
	
	
	public static void m3() {
		
		
		String s = "Hello My name is noel"; 
		int counter = 0;
		
		
		for( int i=0; i<s.length(); i++ ) { 
		    if( s.charAt(i) == 'l' ) { 
		        counter++; 
		    }  
		} 
		
		
	}
		  public static void main(String[] args) {
			  
			  noOfchars.m3();
		
			  
			  
		  }
}
	
	

