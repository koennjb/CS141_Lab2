package lab2;
import java.io.*; 
import java.text.NumberFormat; 
import java.util.Scanner; 
/**
 * Calculates a monthly loan payment given loan amount,
 * interest rate, and years of loan
 * <p>
 * Environment:    PC, Windows 10, jdk1.8.0_151, NetBeans 8.2
 * <p>
 * Date:           1/11/2018 
 * <p>
 * @author Koenn Becker
 * @version     1.0.0
 */

public class Amortize  
{
    /**        
    *  Method:         main()    
    *  Description:    Calculates monthly payment. Stores input from scanner into
    *                  corresponding variables as they are read. Calls payment
    *                  method to calculate the result.
    *                  member methods: inputDouble and payment<p>
    *  Date Created:   1/11/2018
    *  @param          args are the command line strings
    *  @author         Koenn Becker
    */
    
    public static void main (String args[]) {
        // Creates a decimal format for currency 
	NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(); 	

        // Input loan amount using scanner
        Scanner keyboard =  new Scanner(System.in);
	System.out.print ("Enter the loan amount in dollars > "); 
	double loanAmount = keyboard.nextDouble(); 
                
        // Input interest rate as percent using scanner
	System.out.print ("Enter the interest rate in percent > "); 
	double interest = keyboard.nextDouble(); 
		
        // Input years of loan using scanner
	System.out.print ("Enter the number of years > "); 
	double years = keyboard.nextDouble(); 
                
        //call payment method to calculate inputs
	System.out.print ("The payment is: "); 
	System.out.println (moneyFormat.format(payment(loanAmount, interest, years)));
        
    }
        
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

    /**        
    *  Method          payment     
    *  Description:    Calculates the monthly payment on a loan using math 
    *                  formula. Assumes monthly compounding of interest and
    *                  interest is passed as a percent.<p>
    *  Date Created:   1/11/2018  
    *  @author         Koenn Becker
    *  @param          amount Enter amount
    *  @param          interest Enter interest in percent (without % symbol)
    *  @param          years Enter years of loan
    */ 
    static double payment(double amount, double interest, double years) {
        
	double top = amount * interest / 1200; // Gets interest rate per compound
	double bottom = 1 - Math.pow((1 + interest /1200), years *(-12)); 
	return (top / bottom); 
        
    }
    
}
		