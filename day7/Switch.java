package day7;

import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {
    // int day = 3;
    // String dayName;

    // switch (day) {
    //   case 1:
    //     dayName = "mon";
    //     break;
    //   case 2:
    //     dayName = "tues";
    //     break;
    //   case 3:
    //     dayName = "wed";
    //     break;
    
    //   default:
    //     dayName = "N/A";
    //     break;
    // }

    // System.out.println("Today is : " + dayName);

    // 
    // 

    // need breaks or everything after until break will also execute within switch

    // int day = 3;

    // switch (day) {
    //   case 1:
    //     System.out.println("mon: meeting");
    //     break;
    //   case 2:
    //     System.out.println("tues: project a");
    //     break;
    //   case 3:
    //     System.out.println("wed: project b");
    //     break;
    
    //   default:
    //     System.out.println("Invalid day");
    //     break;
    // }


    // 
    // 

    // if vs switch
    // switches dont allow operators/comparisons

    // if (score >= 90){
    //   System.out.println("Grade is A");
    // } else if (score >= 80) {
    //   System.out.println("Grade is B");
    // } else if (score >= 70) {
    //   System.out.println("Grade is C");
    // } else {
    //   System.out.println("Grade is F");
    // }

    // int score = 45;
    // String grade;                       

    // switch(score/10){
    //   case 10:
    //     grade = "A";
    //     break;
    //   case 9:
    //     grade = "A";
    //     break;
    //   case 8:
    //     grade = "B";
    //     break;
    //   case 7:
    //     grade = "C";
    //     break;
    //   case 6:
    //     grade = "D";
    //     break;
      
    //   default:
    //     grade = "F";
    //     break;
    // }

    // System.out.println("Grade is : " + grade);


    // 
    // 

    // char grade = 'B';

    // switch (grade){
    //   case 'A':
    //     System.out.println("good job");
    //     break;
    //   case 'B':
    //     System.out.println("pretty good");
    //     break;
    //   case 'C':
    //     System.out.println("passed");
    //     break;
    //   case 'F':
    //     System.out.println("failed");
    //     break;

    //   default:
    //     System.out.println("grade doesnt exist");
    //     break;
    // }


    // 
    // 

    // scanner within scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a or b:");
    String choice = scanner.nextLine();

    switch (choice) {
      case "a":
        System.out.println("now choose 1 or 2");
        String choice2 = scanner.nextLine();
        switch (choice2) {
          case "1":
            System.out.println("thanks for choosing 1");
            break;
          case "2":
            System.out.println("thanks for choosing 2");
            break;
        
          default:
            System.out.println("wrong");
            break;
        }
        break;
      case "b":
        System.out.println("you lose");
        break;
    
      default:
        System.out.println("wrong choice");
        break;
    }
    
    scanner.close();

  }
}
