package lab4task5;
import java.util.*;
public class CompareInteger {
    public static void main(String[] args) {
        
        /*Given three integers, determine how many of them are equal to each other. The program 
must print one of these numbers: 3 (if all are the same), 2 (if two of them are equal to each other and the 
third is different) or 0 (if all numbers are different). 
Sample Input: 10 5 10 */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number num1:");
        int num1 = input.nextInt();
        
        System.out.println("Enter number num2:");
        int num2 = input.nextInt();
        
        System.out.println("Enter number num3:");
        int num3 = input.nextInt();
        
        if(num1==num2 && num1==num3 && num2==num3){
              System.out.println("Output:3");
        }
        else if(num1==num2 || num1==num3 || num2==num3){
               System.out.println("Output:2");
        }
        else{
               System.out.println("Output:0");
        }
        
    }
    
}
