/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4task9;
import java.util.Scanner;
public class DollarGame {
    public static void main(String[] args) {
        /*Create a change-counting game that gets the user to enter the number of coins required to make exactly 
one dollar. The program should prompt the user to enter the number of pennies, nickels, dimes, and 
quarters. If the total value of the coins entered is equal to one dollar, the program should congratulate 
the user for winning the game. Otherwise, the program should display a message indicating whether the 
amount entered was more than or less than one dollar.*/
        
        System.out.println("Welcome! to thechange-counting game.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of coins required to make 1 dollar for each separated by spaces(pennies, nickels, dimes, and quarters):");
        int pennies = input.nextInt();
        int nickels = input.nextInt();
        int dimes = input.nextInt();
        int quarters = input.nextInt();
        
        double coins_pennies = pennies*0.01;
         double coins_nickels = nickels*0.05;
          double coins_dimes = dimes*0.10;
           double coins_quarters  = quarters *0.25;
           double total_coins = coins_pennies+coins_nickels+coins_dimes+coins_quarters;
           double more_amount = total_coins-1.00;
           double less_amount = 1.00-total_coins;
        
        if(total_coins==1){
             System.out.println("Congratulations! You have won the game.");
        }
        else if(total_coins>1){
            System.out.println("Your amonunt is greater than 1$ that is:"+more_amount);
        }
        else{
            System.out.println("Your amonunt is less than 1$ that is:"+less_amount);
        }
    }
    
}
