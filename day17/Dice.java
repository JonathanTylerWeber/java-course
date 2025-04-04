package day17;

import java.util.Random;
 
class Dice {
    private int value;
 
    // Default Constructor
    public Dice() {
        this.value = 1;  // Initialize dice with value 1
    }
 
    // Method to roll the dice
    public void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;  // Generate a random number between 1 and 6
    }
 
    // Method to get the value of the dice
    public int getValue() {
        return this.value;
    }
}
 
class Game {
    private Dice dice1;
    private Dice dice2;
    private int score;
    private int targetScore;
 
    // Constructor to initialize the game with a target score
    public Game(int targetScore) {
        this.dice1 = new Dice();
        this.dice2 = new Dice();
        this.score = 0;
        this.targetScore = targetScore;
    }
 
    // Method to roll both dice and update the score
    public void rollDice() {
        dice1.roll();
        dice2.roll();
        System.out.println("Dice 1: " + dice1.getValue());
        System.out.println("Dice 2: " + dice2.getValue());
 
        // Example scoring logic: add values of both dice to the score
        this.score += dice1.getValue() + dice2.getValue();
 
        // Check for doubles and add bonus points
        if (dice1.getValue() == dice2.getValue()) {
            System.out.println("You rolled a double! Bonus points added.");
            this.score += 10;  // Bonus points for rolling doubles
        }
    }
 
    // Method to display the current score
    public void displayScore() {
        System.out.println("Current Score: " + this.score);
        System.out.println("Target Score: " + this.targetScore);
    }
 
    // Method to check if the target score is reached
    public boolean isTargetReached() {
        return this.score >= this.targetScore;
    }
}