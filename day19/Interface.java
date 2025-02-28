package day19;

public interface Interface {
  // interfaces good for abstraction
  // can do multiple inheritance
  // loose coupling (can decouple code making it more modular and flexible )

  // constant (cant be changed)
  int CONSTANT = 10;

  // abstract methods
  void methodName();

  // default methods
  default void defaultMethod(){
    System.out.println("default implementation");
  }

  // static method (can be used without having to create object)
  static void staticMethod(){
    System.out.println("static implementation");
  }
  
}
