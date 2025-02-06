package day13;

import java.util.Scanner;

public class NumberOfDigits {
  public static int countDigits(int num){
    if (num < 10){
      return 1;
    } else {
      return 1 + countDigits(num / 10);
    }
  }


  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
 
        // Close the scanner after input
        scanner.close();
 
        // Calculate number of digits using recursion
        int digits = countDigits(num);
 
        // Output the result
        System.out.println("Number of digits in " + num + " is: " + digits);
    }
}
