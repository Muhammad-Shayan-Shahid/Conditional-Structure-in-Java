/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4task10;
import java.util.Scanner;
public class BookPoints {
    public static void main(String[] args) {
        /*Serendipity Booksellers has a book club that awards points to its customers based on the number of books 
purchased each month. The points are awarded as follows:
• If a customer purchases 0 books, he or she earns 0 points.
• If a customer purchases 1 book, he or she earns 5 points.
• If a customer purchases 2 books, he or she earns 15 points.
• If a customer purchases 3 books, he or she earns 30 points.
• If a customer purchases 4 or more books, he or she earns 60 points.
*/ 
        
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the total number of books you have purchased:");
         int books = input.nextInt();
         
         switch(books){
             case 0:
              System.out.println("You have earned 0 points");
              break;
              
               case 1:
              System.out.println("You have earned 5 points");
              break;
              
               case 2:
              System.out.println("You have earned 15 points");
              break;
              
               case 3:
              System.out.println("You have earned 30 points");
              break;
              
               case 4:
              System.out.println("You have earned 60 points");
              break;
              
               default:
               System.out.println("You have earned 60 points");
         }
    }
    
}
