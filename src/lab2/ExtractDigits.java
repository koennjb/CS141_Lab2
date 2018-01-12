package lab2;

import java.awt.SplashScreen;
import javax.swing.JOptionPane;

/**
 * This program has two functions: to accept a date in main(args)
 * and print month and year<br> and to extract each digit in a 4-digit string.
 * <p>
 * Environment:    PC, Windows 10, jdk1.8.0_151, NetBeans 8.2
 * <p>
 * Date:           1/11/2018 
 * <p>
 * @author Koenn Becker
 * @version     1.0.0
 * @see javax.swing.JOptionPane
 */
public class ExtractDigits {
    
    /**        
     *  Event handler   main()<br>
     *  Description:   This is the main method which checks to make sure
     *                  arguments are entered then stores the month and year in
     *                  separate variables using the string index. Then it asks
     *                  for user input using a JOptionDialog and extracts each
     *                  digit then prints them together.
     *                  <p>
     *  Date Created:   1/11/2018
     *  @param          args {@code <month> <year>}
     *  @author         Koenn Becker
     *  @see            javax.swing.JOptionPane
     */
   
    public static void main(String[] args) {
        
    
    // Check for valid number of arguments inputed at comound promt: 2
        if (args.length < 2) {
            System.out.println("usage:  java ExtractDigits <month> <year>"); 
            System.exit(0);
        }
        
        // Converts parameters stored in args into integers
        int month = Integer.valueOf(args[0]);
        int year = Integer.valueOf(args[1]);
        
        // Makes sure month is valid
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please input a month between 1 and 12");
            System.exit(0);
        }
        
        // Checks for illegal year
        if (year < 1969) {
            System.out.println("Year must be greater than 1970");
        }
        
        // Display inputs for month and year
        System.out.print("The month you entered is ");
        System.out.println(month);
        System.out.print("The year you entered is ");
        System.out.println(year);
        
        // Reads a 4 digit number using JOptionPane
        String numberInput = JOptionPane.showInputDialog("Please enter a 4-digit number:");
        
        // Converts string to number and initializes empty variable to store output in
        int number = Integer.parseInt(numberInput);
        String output = "";
        
        // Extracts each digit from number using % and adds them to output string
        System.out.print("The digits of " + number + " are ");
        output += "The digits of " + number + " are ";
        System.out.print(number/1000 + ", ");
        output += number/1000 + ", ";
        number %= 1000;
        System.out.print(number/100 + ",");
        output += number/100 + ", ";
        number %= 100;
        System.out.print(number/10 + ",");
        output += number/10 + ", ";
        number %= 10;
        System.out.print(number + ".");
        output += number + ".";
        
        // Display output in a MessageDialog
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    
    }
    
}
