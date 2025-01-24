package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Methods {
  public static void main(String[] args) {
    // System.out.println("Hello from main");
    // sayHello();
    // sayHelloTo("John", 12);
    // makeSandwich();

    // int ogNum = 10;
    // modifyPrimitive(ogNum);
    // System.out.println("after method, ognum: " + ogNum);
    // primitive doesnt change reference value

    // int[] ogArray = {1, 2, 3};
    // modifyArray(ogArray);
    // System.out.println("after method, ogarr[0]: " + ogArray[0]);
    // nonprimitive (array, object, etc) does change reference value, but not for strings

    // System.out.println(add(1,2));

    Random random = new Random();
    // int myRandomNum = random.nextInt();
    // int myRandomNum2 = random.nextInt(100);
    // int myRandomNum3 = random.nextInt(5, 10);
    
    // System.out.println(myRandomNum3);

    String word = "hello";
    String scrambledWord = scrambleWord(word, random);
    System.out.println("Scrambled Word: " + scrambledWord);
  }

  public static void sayHello(){
    System.out.println("Hello from method");
  }

  public static void sayHelloTo(String name, int age){
    System.out.println("Hello from " + name + ", he's " + age);
  }


  // 
  // 
  // sandwichmaker
  public static void makeSandwich(){
    System.out.println("get bread");
    System.out.println("spread butter");
    System.out.println("add cheese");
    System.out.println("sadniwch ready");
  }

  // 
  // 
  // pass by value vs pass by reference
  public static void modifyPrimitive(int num) {
    num = 20;
    System.out.println("inside method num is " + num);
  }

  public static void modifyArray(int[] arr) {
    arr[0] = 99;
    System.out.println("inside method arr[0] is " + arr[0]);
  }

  // 
  // 
  // method with output
  public static int add(int x, int y){
    return x + y;
  }

  // 
  // 
  // scramble words letters
  public static String scrambleWord(String word, Random random) {
      char[] letters = word.toCharArray();
      for (int i = 0; i < letters.length; i++) {
        int j = random.nextInt(letters.length);
        char temp = letters[i];
        letters[i] = letters[j];
        letters[j] = temp;
      }

      return new String(letters);
    }



}
