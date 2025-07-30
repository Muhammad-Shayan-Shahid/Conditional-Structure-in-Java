/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangle.checker;
import java.util.*;
public class TriangleChecker {
    public static void main(String[] args) {
        //Triangle Type Checker
//Write a program that asks the user to enter three side lengths of a triangle and determines whether it is Equilateral, Isosceles, or Scalene using an if-else structure.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of triangles:");
         System.out.println("Enter 1 side:");
          double a = input.nextDouble();
          System.out.println("Enter 2 side:");
          double b = input.nextDouble();
          System.out.println("Enter 3 side:");
          double c = input.nextDouble();
          
          if(a==b && a==c && b==c){
              System.out.println("It is an Equilateral triangle"); 
          }
          else if(a==b || a==c || b==c){
              System.out.println("It is an Isoceles triangle"); 
          }
           else if(a!=b && a!=c && b!=c){
              System.out.println("It is an Scalene triangle"); 
          }
    }
    
}
