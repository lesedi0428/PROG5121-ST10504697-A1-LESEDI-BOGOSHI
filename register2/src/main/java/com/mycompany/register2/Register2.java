/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.register2;

import java.util.Scanner;

/**
 *
 * @author lesed
 */
public class Register2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        Login2 userLogin = new Login2();
       
        System.out.println("=== USER REGISTRATION ===");
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter Cell Phone Number (+27...): ");
        String cellPhone = scanner.nextLine();

        // Run registration logic
        String result = userLogin.registerUser(username, password, cellPhone, firstName, lastName);
        System.out.println("\n" + result);

        // Check if registration succeeded before offering login
        if (result.contains("successfully captured")) {
            
            System.out.println("\n=== USER LOGIN ===");
            System.out.print("Enter Username: ");
            String loginUser = scanner.nextLine();

            System.out.print("Enter Password: ");
            String loginPass = scanner.nextLine();

            boolean loginResult = userLogin.loginUser(loginUser, loginPass);
            System.out.println(userLogin.returnLoginStatus(loginResult));
        } else {
            System.out.println("\nRegistration failed. Please restart and enter valid details.");
        }
        
         userLogin = new Login2();
        
        scanner.close();
    }
}
