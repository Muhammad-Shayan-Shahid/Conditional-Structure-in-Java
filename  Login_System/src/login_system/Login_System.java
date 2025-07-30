/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login_system;
import java.util. Scanner;
public class Login_System {
    public static void main(String[] args) {
        //If the username is "admin" and the password is "password123", print "Login successful."
        //Otherwise, print "Invalid credentials."
        
        String predfined_username = "admin";
        int predfined_password = 123;
        
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your name:");
        String username = input.nextLine();
        
        System.out.println("Enter your password:");
        int password = input.nextInt();
         
        if(username.equals(predfined_username) && password==predfined_password ) {
              System.out.println("Login successful....");
        }
        else{
            System.out.println("Invalid credentials....");
            System.out.println("Please enter correct username and password....");
        }
    }
    
}
