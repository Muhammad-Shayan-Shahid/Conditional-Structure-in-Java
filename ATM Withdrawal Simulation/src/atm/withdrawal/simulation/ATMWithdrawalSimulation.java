/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm.withdrawal.simulation;
import java.util.*;
public class ATMWithdrawalSimulation {
    public static void main(String[] args) {
        //ATM Withdrawal Simulation:
        //Ask the user for their account balance and the amount they want to withdraw.
        //If the amount is greater than the balance, display "Insufficient Funds."
       //If the amount is less than or equal to the balance, display "Transaction Successful. Remaining Balance: ..."
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your account balance in $:");
        double account_balance = input.nextDouble();
        
        System.out.println("Enter account you want to withdraw in $:");
        double account_withdraw = input.nextDouble();
        
       double remaining_balance = account_balance-account_withdraw;
       
       if(account_balance<account_withdraw ){
           System.out.println("Insufficient Funds.");
       }
       else{
           System.out.println("Transaction Successful. Remaining Balance $:"+remaining_balance);
       }        
    }
    
}
