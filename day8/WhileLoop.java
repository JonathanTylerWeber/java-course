package day8;

import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = -1;

    while (input != 0) {
      System.out.println("enter number, 0 to stop");
      input = scanner.nextInt();

      System.out.println("you entered: " + input);
    }

    scanner.close();
  }
}
