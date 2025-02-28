package day19;

public abstract class Payment {
  
  // abstract methods (no implementation, implemented in child classes)
  abstract void processPayment(double amount);
  
  abstract void initializeTransaction();
  

  // concrete methods:
  void confirmPayment(){
    System.out.println("payment confirmed");
  }
}
