/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proj2;
import java.util.*;
public class GradeCalculater {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your marks (0-100):");
        int marks = input.nextInt();
        
         switch(marks/10){
            case 9:
            case 10:
              System.out.println("Grade: A");
              break;
            case 8:
              System.out.println("Grade:B");
              break;
            case 7:
              System.out.println("Grade:C");
              break;
            case 6:
              System.out.println("Grade:D");
              break;
            default:
              System.out.println("Grade:F");
        }
    }
    
}
