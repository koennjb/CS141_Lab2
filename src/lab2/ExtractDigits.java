/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author 955338810
 */
public class ExtractDigits {
    
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
    }
    
}
