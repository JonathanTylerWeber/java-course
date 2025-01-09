package day6;
import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println();

    // boolean isSunny = true;
    
    // String name = scanner.nextLine();

    // if(name.equals("Jonathan")){
    //   System.out.println("Hello Jonathan");
    // }

    // System.out.println("whoopee");
    // int a = 5;
    // int b = 10;
    // if (a > 0){
    //   if (b > a){
    //     System.out.println("b greater than a");
    //   }
    // }

    // boolean a = true;
    // boolean b = false;
    // boolean c = true;

    // boolean result = a && b; //false
    // boolean result2 = a && c; //true
    // boolean result3 =  a || b; //true
    // boolean result4 = !a || b; //false

    // 
    // 

    // int d = 5;
    // int e = 10;

    // if((d > 0) && (e>d)){
    //   System.out.println("b is greater than a");
    // }

    // int number = 10;

    // if (number % 2 == 0){
    //   System.out.println("even");
    // } else {
    //   System.out.println("odd");
    // };


    // 
    // 
    // int number = -5;

    // if (number > 0){
    //   System.out.println("positive");
    // } else {
    //   if(number < 0){
    //     System.out.println("neg");
    //   } else {
    //     System.out.println("zero");
    //   }
    // };

    // 
    // 
    // int score = 45;

    // if (score >= 90){
    //   System.out.println("Grade is A");
    // } else if (score >= 80) {
    //   System.out.println("Grade is B");
    // } else if (score >= 70) {
    //   System.out.println("Grade is C");
    // } else {
    //   System.out.println("Grade is F");
    // }


    // 
    // ternary
    int age = 16;
    double discount = (age < 18) ? 0.10 : 0.5;

    System.out.println("the discount is: " + discount * 100 + "%");

    int score = 85;
    char grade = (score>=90)? 'A' 
    : (score >= 80) ? 'B' 
    : (score >= 70) ? 'C'
    : (score >= 60) ? 'D'
    : 'F';

    System.out.println("the grade is: " + grade);

    // **********************
    // **********************
    // can run in debug mode play button top right and open debug console below by terminal
    // **********************

    // System.out.println("after if");
    scanner.close();
  }
}