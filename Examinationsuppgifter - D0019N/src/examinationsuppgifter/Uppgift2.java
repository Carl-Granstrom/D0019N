/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationsuppgifter;

//importation of the scanner class
import java.util.Scanner; 

/**
 *
 * @author christianmartensson
 */
public class Uppgift2 {
    public static void main(String[] args) {

        // A new Scanner object is created for use in this class.
        Scanner input = new Scanner(System.in);
        
        // Variables are initialized
        int number; // number to be input by the user (the degree of faculty)
        int sum = 1; // the sum of the faculty
        
        // Program asks for input, which can then be input using the scanner.
        System.out.println("Type a number for which the faculty"
                + " should be printed: ");
        number = input.nextInt();
        
        // if input is less than 0, print an error value
        if (number < 0)
            System.out.println("Error, nummret är mindre än noll.");
        
        // if input is 0, print 1
        else if (number == 0)
            System.out.println("!0 = 1");
        
        // else (number > 0), run a for-loop that prints the faculty in the form 
        // of multiplication (3! = 1 * 2 * 3)
        else
            System.out.print(number + "! = ");
        
            for (int i = 1; i <= number; i++) {
                // for the last number, an "*" is not printed after the number
                if (i == number) {
                    System.out.print(i);
                }
                else {
                    System.out.print(i + " * ");
                }
                // calculates the sum of the faculty, after multiplication.
                sum = sum * i;

            }
            // prints the sum.
            System.out.println(" = " + sum);
    }
}
