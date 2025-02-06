package day13;

import java.util.Scanner;

public class NumberOfDigits2 {
  public static int countDigits(int num){
    if (num < 10) {
      return 1;
    } else {
      return 1 + countDigits(num / 10);
    }
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number:");
    int num = scanner.nextInt();

    int digits = countDigits(num);

    System.out.println("The number of digits in " + num + " is: " + digits);

    scanner.close();
  }
}
