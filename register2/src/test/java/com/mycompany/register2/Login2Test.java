/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.register2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lesed
 */
public class Login2Test {
    
    public Login2Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login2.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "dh_d";
        Login2 instance = new Login2();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);

    }

    /**
     * Test of checkPasswordComplexity method, of class Login2.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "porte34";
        Login2 instance = new Login2();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of checkCellPhoneNumber method, of class Login2.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellPhoneNumber = "+0834567945";
        Login2 instance = new Login2();
        boolean expResult = false;
        boolean result = instance.checkCellPhoneNumber(cellPhoneNumber);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of registerUser method, of class Login2.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String cellPhoneNumber = "";
        String firstName = "";
        String lastName = "";
        Login2 instance = new Login2();
        String expResult = "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        String result = instance.registerUser(username, password, cellPhoneNumber, firstName, lastName);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of loginUser method, of class Login2.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "";
        String enteredPassword = "";
        Login2 instance = new Login2();
        boolean expResult = false;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of returnLoginStatus method, of class Login2.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean isLoggedIn = false;
        Login2 instance = new Login2();
        String expResult = "Username or password incorrect, please try again.";
        String result = instance.returnLoginStatus(isLoggedIn);
        assertEquals(expResult, result);
       
    }
    
}
