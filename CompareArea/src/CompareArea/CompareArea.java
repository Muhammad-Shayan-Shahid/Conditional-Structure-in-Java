/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4task7;
import java.util.*;
public class CompareArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //The area of a rectangle is the rectangle’s length times its width. Write a program that asks  the length 
//and width of two rectangles. The program should tell the user which rectangle has the greater area, or 
//the areas are the same.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and width of rectangle (A) separated by spaces:");
        double length1 = input.nextDouble();
        double width1 = input.nextDouble();
        
        double area_rA = length1*width1 ;

        System.out.println("Enter length and width of rectangle (B) separated by spaces:");
        double length2 = input.nextDouble();
        double width2 = input.nextDouble();
        
        double area_rB = length2*width2 ;
        
         System.out.println("Area of rectangle are ::");
         System.out.println("Area of rectangle (A) is :"+area_rA);
          System.out.println("Area of rectangle (B) is :"+area_rB);
        
        if(area_rA==area_rB){
               System.out.println("Area of rectangle (A)is equal to rectangle (B) ");
        }
        else if(area_rA>area_rB){
               System.out.println("Area of rectangle (A)is greater than rectangle (B) ");
        }
         else{
               System.out.println("Area of rectangle (B)is greater than rectangle (A) ");
        }
    }
    
}
