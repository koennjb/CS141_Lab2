// The method below that was in the Lab 2 Assignment looks to be outdated or
//not used anymore because program is using Scanner instead of BufferedReader now
//Will ask about in class on Wednesday

/**
    *  Method:   inputDouble()    
    *  Description:    Converts user input from a String to a double.<p>
    *  Date Created:   1/11/2018
    *  @param          prompt
    * @param           in 
    * @return          double
    *  @author         Koenn Becker
    */  
//  public static double inputDouble (String prompt, BufferedReader in) {
//	boolean error;          // error detector 
//	String input = "";      // read input variable 
//	double value = 0;       // converted input to a double type     
//			
//	do {
//            error = false; 
//            System.out.print(prompt); 
//            System.out.flush();
//            
//            try {
//		input = in.readLine();
//                
//            } catch(IOException e) {
//                System.out.println ("An input error was caught"); 
//		System.exit (1); 
//                
//            }
//            
//            try {
//		value = Double.valueOf(input).doubleValue(); 
//                
//            } catch (NumberFormatException e) {
//		System.out.println("Please try again"); 
//		error = true;
//            }
//	} while (error);
//	return value;
//        
//    }