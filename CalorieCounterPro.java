// can run 'javac' which compiles and then 'java {fileName}' to run
// or just hit run in vs code

import java.util.Scanner;

public class CalorieCounterPro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String food1, food2, food3;
    int calories1, calories2, calories3;

    System.out.println("Welcome to Calorie Counter Pro");

    System.out.println("Enter the name of food 1: ");
    food1 = scanner.nextLine();
    System.out.println("Enter the calories of food 1: ");
    calories1 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter the name of food 2: ");
    food2 = scanner.nextLine();
    System.out.println("Enter the calories of food 2: ");
    calories2 = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Enter the name of food 3: ");
    food3 = scanner.nextLine();
    System.out.println("Enter the calories of food 3: ");
    calories3 = scanner.nextInt();
    scanner.nextLine();

    int totalCalories = calories1 + calories2 + calories3;

    System.out.println("Your caloric intake:");
    System.out.println("1. " + food1 + " - " + calories1 + " calories");
    System.out.println("2. " + food2 + " - " + calories2 + " calories");
    System.out.println("3. " + food3 + " - " + calories3 + " calories");

    System.out.println("Your total caloric intake was: " + totalCalories);

    scanner.close();
  }
}