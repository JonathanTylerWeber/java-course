package day19;

public class CreditCardPayment extends Payment {

  // must implement abstract classes from parent class
  @Override
  void processPayment(double amount) {
    initializeTransaction();
    System.out.println("Processing credit card payment"  + amount);
    confirmPayment();
  }

  @Override
  void initializeTransaction() {
    System.out.println("initializing credit card payment");

  }
  
}
