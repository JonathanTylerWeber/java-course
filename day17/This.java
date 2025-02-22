package day17;

import java.util.Scanner;

public class This {
    public static void main(String[] args) {
      // SmartAppliance appliance1 = new SmartAppliance("ac", "cooling", "on");

      // // creating new instance
      // SmartAppliance appliance2 = appliance1.getInstance();

      // // creating reference to other object
      // SmartAppliance appliance3 = appliance1;

      // // method chaining
      // appliance2.setApplianceName("ac2")
      //           .setApplianceType("cooling mooling")
      //           .setPowerStatus("off");

      // System.out.println("app2:");
      // appliance2.displayDetails();

      // // setting this also changes appliance 1 since app 3 references app 1
      // appliance3.setApplianceName("ac3");

      // System.out.println("app3:");
      // appliance3.displayDetails();

      // System.out.println("app1:");
      // appliance1.displayDetails();


      // 
      // 


      // using objects as parameters
      // Smartphone sm1 = new Smartphone( "Magic V3", "Honor", 1800);
      // Smartphone sm2 = new Smartphone( "16 Max", "iPhone", 1600);

      // // using copy constructor to create new object, not reference
      // Smartphone sm3 = new Smartphone(sm2);

      // // just creates reference
      // Smartphone sm4 = sm1;

      // // sm1.applyDiscount(20);

      // // sm1.comparePrice(sm2);


      // sm3.applyDiscount(20);

      // sm2.comparePrice(sm3);

      // sm3.displayDetails();

      // sm4.displayDetails();


      // 
      // 


      Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to Lucky Dice Adventure!");
      System.out.print("Enter the target score to win: ");
      int targetScore = scanner.nextInt();

      Game game = new Game(targetScore);

      boolean playing = true;
      while (playing) {
          System.out.println("Press 'r' to roll the dice, 's' to stop:");
          char choice = scanner.next().charAt(0);
          if (choice == 'r') {
              game.rollDice();
              game.displayScore();
              if (game.isTargetReached()) {
                  System.out.println("Congratulations! You've reached the target score!");
                  playing = false;
              }
          } else if (choice == 's') {
              System.out.println("You chose to stop. Final Score: ");
              game.displayScore();
              playing = false;
          } else {
              System.out.println("Invalid choice. Please try again.");
          }
      }
      scanner.close();
    }
}
