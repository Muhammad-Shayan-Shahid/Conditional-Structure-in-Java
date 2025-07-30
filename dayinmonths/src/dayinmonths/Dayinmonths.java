/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dayinmonths;
import java.util. Scanner;
public class Dayinmonths {
    public static void main(String[] args) {
        // Write a Java program that asks the user to input a month number (1-12) and prints the number of days in that month using a switch statement.
    
        Scanner input  = new Scanner(System.in);
        System.out.println("Select a month number(1-12) 1 belongs to January and so on..:");
        int num = input.nextInt();
        
        switch(num){
            case 1:
               System.out.println("January"); 
               break;
               
            case 2:
               System.out.println("February"); 
               break;
               
            case 3:
               System.out.println("March"); 
               break;
               
             case 4:
               System.out.println("April"); 
               break;
               
            case 5:
               System.out.println("May"); 
               break;
               
            case 6:
               System.out.println("June"); 
               break;
               
            case 7:
               System.out.println("July"); 
               break;
               
            case 8:
               System.out.println("August"); 
               break;
               
            case 9:
               System.out.println("september"); 
               break;
               
            case 10:
               System.out.println("October"); 
               break;
               
            case 11:
               System.out.println("November"); 
               break;
               
            case 12:
               System.out.println("December"); 
               break;
        }
    }
    
}
