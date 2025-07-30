/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4task4;
import java.util.*;
public class SmallestInteger {
    public static void main(String[] args) {
        // a) Minimum of two numbers: Given two integers, print the smaller value.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = input.nextInt();
        
        System.out.println("Enter number b:");
        int b = input.nextInt();
        
        if(a>b){
              System.out.println("Smaller value is b:"+b);
        }
        else{
               System.out.println("Smaller value is a:"+a);
        }
        
        //c) Sign function: For the given integer X print 1 if it's positive, -1 if it's negative, or 0 if it's equal to zero.
        System.out.println("Enter integer X:");
        int X = input.nextInt();
        
        if(X>0){
              System.out.println("The number is positive");
        }
        else if(X<0){
               System.out.println("The number is negative");
        }
         else{
               System.out.println("The number is zero");
        }
        
        //d) Minimum of three numbers: Given three integers, print the smallest value. 
         System.out.println("Enter number num1:");
        int num1 = input.nextInt();
        
        System.out.println("Enter number num2:");
        int num2 = input.nextInt();
        
        System.out.println("Enter number num3:");
        int num3 = input.nextInt();
        
        if(num2>num1 && num3>num1){
              System.out.println("Smaller value is num1:"+num1);
        }
        else if(num1>num2 && num1>num3){
               System.out.println("Smaller value is num2:"+num2);
        }
        else{
               System.out.println("Smaller value is num3:"+num3);
        }
    }
    
}
