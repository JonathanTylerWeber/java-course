package day19;

public class PayPalPayment extends Payment {
  
  // must implement abstract classes from parent class
  @Override
  void processPayment(double amount) {
    initializeTransaction();
    System.out.println("Processing paypal payment" + amount);
    confirmPayment();
  }

  @Override
  void initializeTransaction() {
    System.out.println("connecting to paypal");
  }


}
