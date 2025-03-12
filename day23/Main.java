package day23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter a number to divide 10 by: ");

    // try {
    //   int userInput = scanner.nextInt();
    //   int result = 10/userInput;
    //   System.out.println("The result is: " + result);
    // // } catch (Exception e) {
    // //   System.out.println(e.getMessage());
    // //   System.out.println(e.fillInStackTrace());
    // } catch (ArithmeticException e) {
    //   System.out.println("Arithmetic exception, don't divide by 0");
    // } catch (InputMismatchException e) {
    //   System.out.println("Input Mismatch exception, only enter numbers");
    // } catch (Exception e) {
    //   System.out.println("Exception caught something unexpected happened " + e.getMessage());
    // } finally {
    //   System.out.println("finally: this is printed with/without error");
    //   scanner.close();
    //   // db connection can close here
    //   // download stream close
    // }

    // System.out.println("still works, didnt crash");
    // scanner.close();




    // 
    // 
    // try {
    //   handleUserRegistration("JohnDoe", "123");
    //   handleUserRegistration("JaneDoe", "");
    // } catch (Exception e) {
    //   System.out.println("caught exception in main: " + e.getMessage());
    // }



    // 
    // 
    // exception propagation
    // when an exception occurs in a method and it is not handled in that method, the exception is propagated to the caller of that method
    // this process continues until the exception is caught by a method in the call stack or it reaches the main method where it causes the program to terminate if unhandled
    try {
      processOrder();
    } catch (Exception e) {
      // catching the propagated exception in the main method
      System.out.println("exception caught in main: " + e.getMessage());
    }
    
  }

  public static void processOrder() throws Exception {
    calculateTotalPrice(); // might throw exception
  }

  public static void calculateTotalPrice() throws Exception {
  checkInventory();  // might throw exception
  }

  public static void checkInventory() throws Exception {
    throw new Exception("insufficient inventory for the order"); // throw exception
  }



  // 
  // 
  // 


  // rethrow error
  // public static void handleUserRegistration(String username, String password) throws Exception {
  //   try {
  //     validatePassword(password);
  //     System.out.println("User " + username + " registered successfully");
  //   } catch (IllegalArgumentException e) {
  //     System.out.println("error in handleuserregistration: " + e.getMessage());
  //     // add context before rethrowing (exception is checked exception (checked during compile time (while coding))
  //     throw new Exception("registration failed for: " + username, e);
  //   }
  // }

  // public static void validatePassword(String password){
  //   if (password == null || password.isEmpty()) {
  //     // unchecked exception (not checked during compile time (while coding))
  //     throw new IllegalArgumentException("password can't be empty");
  //   }
  // }
}
