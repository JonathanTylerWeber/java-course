package day19;

public class Calculator {
  // method overloading/ static or compile time polymorphism
  // multiple methods with same name, but different parameters at compile time, not run time
  public int add(int a, int b){
    return a + b;
  }

  public double add(double a, double b){
    return a + b;
  }

  public int add(int a, int b, int c){
    return a + b + c;
  }
}
