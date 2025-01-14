package day8;

import java.util.Scanner;

public class ForLoop {
  public static void main(String[] args) {
    // for (int i = 10; i >= 1; i--) {
    //   System.out.println(i);
    // }

    // 
    // 
    // nested for loops
    // for (int i = 0; i < 10; i++) {
    //   // System.out.print(i);
    //   for (int j = 0; j < 10; j++) {
    //     System.out.print(i + "" + j + " ");
    //   }
    //   System.out.println();
    // }

    // 
    // 
    // pyramid with for loops
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("How many levels?");
    // int levels = scanner.nextInt();

    // for (int i = 1; i <= levels; i++) {
    //   for (int j = 0; j < levels - i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int k = 0; k < 2*i-1; k++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
      
    // }

    // scanner.close();

    // 
    // 
    // fibonacci sequence
    Scanner scanner = new Scanner(System.in);
    // System.out.println("How many terms?");
    // int n = scanner.nextInt();

    // int first = 0, second = 1;
    // if(n == 1){
    //   System.out.print(first);
    // }else{
    //   System.out.print(first + " " + second);

    //   for (int i = 3; i <= n; i++) {
    //     int next = first + second;
    //     System.out.print(" " + next);
    //     first = second;
    //     second = next;
    //   }
    // }


    // 
    // 
    // break keyword
    // for (int i = 1; i <= 5; i++) {
    //   if(i == 3){
    //     break;
    //   }
    //   System.out.println(i);
    // }
    // System.out.println("after for loop");

    // 
    // 
    // continue keyword
    // for (int i = 1; i <= 5; i++) {
    //   if(i == 3){
    //     System.out.println("we ignore this");
    //     continue;
    //   }
    //   System.out.println(i); // 1 2 4 5
    // }
    // System.out.println("after for loop");

    // 
    // 
    // labels and break and continue
    outerLoop: //label
    for (int i = 1; i <= 3; i++) {
      // innerLoop: //label
      for (int j = 1; j <= 3; j++) {
        if (i == 2 && j == 2){
          continue outerLoop;
        }
        System.out.println("i: " + i + ", j:" + j);
      }
    }
    System.out.println("loop ended");

    scanner.close();
  }
}
