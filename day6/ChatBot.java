package day6;

import java.util.Scanner;

public class ChatBot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter prompt");

    String userInput = scanner.nextLine();

    if(userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")){
      System.out.println("Chatbot: hello there");
    }

    if(userInput.equalsIgnoreCase("how are you") || userInput.equalsIgnoreCase("hows it going")){
      System.out.println("Chatbot: I have no feelings");
    }

    if(userInput.equalsIgnoreCase("weather") || userInput.equalsIgnoreCase("hows the weather")){
      System.out.println("Chatbot: It's a sunny day");
    }

    if(userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")){
      System.out.println("Chatbot: Later loser");
    }

    if (!(userInput.equalsIgnoreCase("hello") 
      || userInput.equalsIgnoreCase("hi") 
      || userInput.equalsIgnoreCase("how are you") 
      || userInput.equalsIgnoreCase("hows it going") 
      || userInput.equalsIgnoreCase("weather") 
      || userInput.equalsIgnoreCase("hows the weather") 
      || userInput.equalsIgnoreCase("bye") 
      || userInput.equalsIgnoreCase("goodbye"))
    ){
      System.out.println("Chatbot: Sorry I'm stupid");
    }

    scanner.close();
  }
}
