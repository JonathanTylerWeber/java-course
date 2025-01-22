package day10;

import java.util.ArrayList;

// import java.util.Scanner;

public class TwoDArray {
  public static void main(String[] args) {
    // int [][] my2DArray = new int[3][3];
    // my2DArray[0][0] = 1;
    // my2DArray[0][1] = 2;
    // my2DArray[0][2] = 3;
    // my2DArray[1][0] = 4;
    // my2DArray[1][1] = 5;
    // my2DArray[1][2] = 6;
    // my2DArray[2][0] = 7;
    // my2DArray[2][1] = 8;
    // my2DArray[2][2] = 9;

    // System.out.println("my2darray rows length " + my2DArray.length);
    // System.out.println("my2darray cols length " + my2DArray[0].length);

    // for (int i = 0; i < my2DArray.length; i++) {
    //   for (int j = 0; j < my2DArray[i].length; j++) {
    //     System.out.print(my2DArray[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // 
    // 
    // easier initialization
    // int[][] newArray = {
    //   {1,2,3}, 
    //   {4,5,6}, 
    //   {7,8,9}
    // };

    // for (int i = 0; i < newArray.length; i++) {
    //   for (int j = 0; j < newArray[i].length; j++) {
    //     System.out.print(newArray[i][j] + " ");
    //   }
    //   System.out.println();
    // }

    // 
    // 
    // enhanced for loops
    // int[][] newArray = {
    //   {1,2,3}, 
    //   {4,5,6}, 
    //   {7,8,9}
    // };

    // for (int[] rows: newArray) {
    //   for (int num: rows) {
    //     System.out.print(num + " ");
    //   }
    //   System.out.println();
    // }

    // 
    // 
    // get largest number
    // int[][] newArray = {
    //   {1,2,3}, 
    //   {4,5,6}, 
    //   {7,8,9}
    // };

    // int largest = newArray[0][0];
    // for (int[] rows: newArray) {
    //   for (int num: rows) {
    //     if (num > largest){
    //       largest = num;
    //     }
    //   }
      
    // }
    // System.out.println(largest);

    // 
    // 
    // sum all items
    // int[][] newArray = {
    //   {1,2,3}, 
    //   {4,5,6}, 
    //   {7,8,9}
    // };

    // int sum = 0;
    // for (int[] rows: newArray) {
    //   for (int num: rows) {
    //     sum += num;
    //   }
      
    // }
    // System.out.println(sum);

    // 
    // 
    // exercise
    // Scanner scanner = new Scanner(System.in); 
    // System.out.println("enter amount of rows and columns:");
    // int n = scanner.nextInt();

    // int[][] matrix = new int[n][n];

    // for (int i = 0; i < n; i++) {
    //   for (int j = 0; j < n; j++) {
    //     System.out.println("enter value for: " + i + " " + j);
    //     matrix[i][j] = scanner.nextInt();
    //   }
    // }

    // int sum = 0;

    // for (int i = 0; i < n; i++) {
    //   sum += matrix[i][i];
    // }

    // System.out.println("sum of diagonals: " + sum);

    // scanner.close();


    // 
    // 
    // array lists
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");
    fruits.add("Dates");

    System.out.println(fruits.getFirst());
    System.out.println(fruits.get(1));

    boolean hasApple = fruits.contains("apple"); //case sensitive
    System.out.println(hasApple); 

    System.out.println(fruits.size()); 

    fruits.remove("Banana");
    fruits.remove(0);

    fruits.addFirst("Pear");
    fruits.addLast("Durian");
    fruits.add(2, "Plum");

    for (String fruit : fruits) {
      System.out.println(fruit);
    }

  }
}
