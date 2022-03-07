mport java.util.Scanner;  // Import the Scanner class

class EinsteinEquation {
	/**
	* Declaring constants.
	*/
	private static final double SPEED_LIGHT = 2.998 * (Math.pow(10, 8));

	/**
	* Display result.
	*/
	//String = String();  // should be 'new String()'
	public static void main(String[] args) {
		// create scanner
	    	final Scanner sc = new Scanner(System.in);
	    	//get user input
	    	System.out.print("Enter the mass of the object:");
	    	// read user input
	    	final String massString = sc.nextLine();
	    	try {
	    		//convert user inpout from string to double
	    		massDouble = Double.parseDouble(massString);
	    		// check if value is negative
	    		if (massDouble >= 0) {
	    		//calculate energy
	    		energy = massDouble * (Math.pow(SPEED_LIGHT, 2));
	    		// Display result to console
	             	System.out.println("The amount of energy that could be released from a mass of " + mass + "kg is " + energy + " Joules");                              } else {
			// catch negative input (L, N)
	    			 System.out.println("Invalid entry");
	                                                                                               	   } catch (IllegalArgumentException exception) {
		// catch error
		System.out.println("Invalid entry");
	}
		}	
