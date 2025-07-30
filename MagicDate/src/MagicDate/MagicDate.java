/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4task8;
import java.util.*;
public class MagicDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*The date June 10, 1960, is special because when it is written in the following format, the month times the 
day equals the year: 6/10/60 
Design a program that asks the user to enter a month (in numeric form), a day, and a two-digit year. The 
program should then determine whether the month times the day equals the year. If so, it should display a 
message saying the date is magic. Otherwise, it should display a message saying the date is not magic. */ 
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month (in numeric form), a day, and a two-digit year (e.g : 2019 is 19) separated by spaces");
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();
        
        int product = month*day;
        
        if(product==year){
            System.out.println("The date is magic");
        }
        else{
            System.out.println("The date is not a magic");
        }
    }
    
}
