package day16;

public class Car2 {

  // default access modifier
  // void drive(){
  //   System.out.println("Driving");
  // }

  // variables can also be private so they're only set in this class
  private String brand;
  private String color;
  

  // makes this method only accessible from Car2 class
  // gives controls over drive method and when/how it's called
  private void drive(){
    System.out.println("Driving");
  }

  void justDrive(){
    drive();
  }

  // constructor, color cannot be changed after since private and no setter to change
  public Car2(String color){
    this.color = color;
  }

  // setter to help set private variables, brand can change after being initialized
  public void setBrand(String brand){
    // can make sure certain rules are applied
    if(brand == "toyota"){
      System.out.println("You can't use toyotas");
      brand = "bad";
    }
    this.brand = brand;
  }

  public void displayDetails(){
    System.out.println("car brand: " + brand + ", color: " + color);
  }


}
