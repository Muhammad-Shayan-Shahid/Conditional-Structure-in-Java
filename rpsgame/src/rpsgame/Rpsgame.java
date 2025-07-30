/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rpsgame;
import java.util.*;
public class Rpsgame {
    public static void main(String[] args) {
        //Write a simple Rock, Paper, Scissors game where:
        //The user enters their choice (rock, paper, or scissors).
        //The computer randomly selects one.
        //Use if-else conditions to determine the winner based on game rules.
        
        
        
        //Input for users:
        Scanner input  = new Scanner(System.in);
        System.out.println("Select any one (Rock,Paper and Scissors):");
        String user_choice = input.nextLine();
        
        //string of games items
        String[] game = {"Rock","Paper","Scissors"};
        
        //Random selection;
        Random random = new Random();
        
        String selected_choice = game[random.nextInt(game.length)];
        
        //Game selections:
        
        System.out.println("You selected :"+user_choice);
        System.out.println("Other Player selected:"+selected_choice);
        
        //Conditions
        if(user_choice.equals(selected_choice)){
            System.out.println("Match tied");
        }
        else if(user_choice.equals(game[0])){
              if(selected_choice.equals(game[1])){
                   System.out.println("You have lost...");
              }
              else {
                System.out.println("You have won the game...");      
            } 
            }
        else if(user_choice.equals(game[1])){
              if(selected_choice.equals(game[0])){
                   System.out.println("You have won the game...");
              }
              else {
                System.out.println("You have lost...");      
            } 
            }
         else if(user_choice.equals(game[2])){
              if(selected_choice.equals(game[0])){
                   System.out.println("You have lost...");
              }
              else {
                System.out.println("You have won the game...");      
            } 
            } 
    }
    
}
