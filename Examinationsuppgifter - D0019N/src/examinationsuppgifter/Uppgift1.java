/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examinationsuppgifter;

// Imports the scanner class to this program.
import java.util.Scanner; 
/**
 *
 * @author christianmartensson
 */
public class Uppgift1 {
    public static void main(String[] args) {
        
        // Creates a new scanner object
        Scanner input = new Scanner(System.in); 
        
        // DDefine the variables and their datatypes
        int cost;
        int paid;
        int change;
        int temp;
        
        // User inputs the cost of the purchase
        System.out.println("Enter the cost of the purchase: ");
        cost = input.nextInt();
        
        // User inputs amount paid
        System.out.println("Enter amount payed: ");
        paid = input.nextInt();
        
        // the variable "change" is defined as the cost minus amount paid 
        change = paid - cost;

        // prints the three variables: cost, paid and change
        System.out.println("Cost of the purchase: " + cost + "kr.");
        System.out.println("Amount payed: " + paid + "kr.");
        System.out.println("Change to be returned: " + change + "kr.");
        
        // The following part of the program prints the "change",
        // divided in specific bank notes
        System.out.print("Banknotes to be returned: ");
        
        /* 
        If the change (stored in temp) is larger than 1000, then this
        for-loop removes 1000 from the temp variables until the remaining change
        is less than 1000.
        */
        for (temp = change; temp >= 1000; temp = temp - 1000) {
            System.out.print("1000:-, ");
        }
        
        /* 
        If the change (stored in temp) is larger than 500, then this
        for-loop removes 500 from the temp variables until the remaining change
        is less than 500. And so on for the following for-loops. 
        
        temp = temp because it doesn't run otherwise. Unknown reason. 
        */
        for (temp = temp; temp >= 500; temp = temp - 500) {
            System.out.print("500:-, ");
        }
        
        for (temp = temp; temp >= 200; temp = temp - 200) {
            System.out.print("200:-, ");
        }
        
        for (temp = temp; temp >= 100; temp = temp - 100) {
            System.out.print("100:-, ");
        }
        
        for (temp = temp; temp >= 50; temp = temp - 50) {
            System.out.print("50:-, ");
        }
        
        for (temp = temp; temp >= 20; temp = temp - 20) {
            System.out.print("20:-, ");
        }
        
        for (temp = temp; temp >= 5; temp = temp - 5) {
            System.out.print("5:-, ");
        }
        
        for (temp = temp; temp >= 2; temp = temp - 2) {
            System.out.print("2:-, ");
        }
        
        for (temp = temp; temp >= 1; temp = temp - 1) {
            System.out.print("1:-, ");
        }         
        
        System.out.println("");
    }
    
}
