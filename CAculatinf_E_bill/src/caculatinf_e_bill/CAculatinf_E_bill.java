/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caculatinf_e_bill;
import java.util.Scanner;
public class CAculatinf_E_bill {
    public static void main(String[] args) {
        //Take the number of units consumed as input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of units consumed:");
        double units_cosumed = input.nextDouble();
        
        
        //Calculaions:
        
        if(units_cosumed<=100){
           double total_bill = units_cosumed*5;
            System.out.println("Total bill is = $"+total_bill);
        }
        else if(units_cosumed>100 && units_cosumed<=300){
           double total_bill = (100*5)+((units_cosumed-100)*7);
            System.out.println("Total bill is = $"+total_bill);
        }
        else {
           double total_bill = (100*5)+(200*7)+((units_cosumed-300)*10);
            System.out.println("Total bill is = $"+total_bill);
        }
    }
    
}
