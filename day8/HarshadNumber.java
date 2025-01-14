package day8;

import java.util.Scanner;

public class HarshadNumber {
  public static void main(String[] args) {
    // 156 ( 1, 5, 6)
    // 1+5+6 = 12
    // 156 / 12 = 13
    // 156 is a harshad number

    Scanner scanner = new Scanner(System.in);

    int input;
    System.out.println("enter number:");

    input = scanner.nextInt();

    int ogNum = input;
    int sumOfDigits = 0;

    while (input > 0) {
      sumOfDigits += input % 10;
      input /= 10;
    }

    if (ogNum % sumOfDigits == 0){
      System.out.println("the number is a harshad number");
    } else {
      System.out.println("the number isn't a harshad number");
    }

    scanner.close();
  }
}
