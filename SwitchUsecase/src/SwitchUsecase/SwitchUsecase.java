/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4task6;
import java.util.*;
public class SwitchUsecase {
    public static void main(String[] args) {
        
        /*Write a program that prompts the user to enter a number within the range of 1 through 10. The program 
should display the Roman numeral version of that number. If the number is outside the range of 1 through 
10, the program should display an error message. The following table shows the Roman numerals for the 
numbers 1 through 10*/ 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between(1-10):");
        int num = input.nextInt();
        
        if(num>10 || num<1){
            System.out.println("Invalid number");
            System.out.println("Please select number between(1-10)");
        }
        else{
            switch(num){
                case 1:
                System.out.println("I");  
                break;
                
                case 2:
                System.out.println("II");  
                break;
                
                 case 3:
                System.out.println("I");  
                break;
                
                 case 4:
                System.out.println("IV");  
                break;
                
                 case 5:
                System.out.println("V");  
                break;
                
                 case 6:
                System.out.println("VI");  
                break;
                
                 case 7:
                System.out.println("VII");  
                break;
                
                 case 8:
                System.out.println("VIII");  
                break;
                
                 case 9:
                System.out.println("IX");  
                break;
                
                 case 10:
                System.out.println("X");  
                break;
            }
        }
        
    }
    
}
