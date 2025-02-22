package day17;

public class Smartphone {
  private String model;
  private String brand;
  private double price;

  // copy constructor
  public Smartphone(Smartphone mySmartphone){
    this.model = mySmartphone.model;
    this.brand = mySmartphone.brand;
    this.price = mySmartphone.price;
  }

  // parameterized constructor
  public Smartphone(String model, String brand, double price){
    this.model = model;
    this.brand = brand;
    this.price = price;
  }

  public void applyDiscount(double discountPercentage){
    this.price -= this.price * (discountPercentage/100);
  }

  public void comparePrice(Smartphone otherSmartphone){
    if(this.price < otherSmartphone.price){
      System.out.println(this.model + " is cheaper than " + otherSmartphone.model);
    } else if(this.price > otherSmartphone.price){
      System.out.println(this.model + " is more expensive than " + otherSmartphone.model);
    } else {
      System.out.println(this.model + " is is the same price as " + otherSmartphone.model);

    }
  }

  public void displayDetails(){
    System.out.println("model " + model + "brand " + brand + "price " + price);
  }



}
