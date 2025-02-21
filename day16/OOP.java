package day16;

public class OOP {
  public static void main(String[] args) {
  //   Car myToyota = new Car();
  //   myToyota.color = "red";
  //   myToyota.model = "toyota";
  //   myToyota.year = 2022;

  //   Car myAudi = new Car();
  //   myAudi.color = "black";
  //   myAudi.model = "A3";
  //   myAudi.year = 2011;

  //  System.out.println("My Toyota is " + myToyota.color);
  //  System.out.println("My Audi is " + myAudi.color);

  //  myToyota.showDetails();


  //  SmartDevice honorMagicV2 = new SmartDevice();
   
  //  honorMagicV2.displayStatus();

  //  honorMagicV2.brand = "Honor";
  //  honorMagicV2.model = "Magic V2";
  //  honorMagicV2.batteryLife = 94;

  //  honorMagicV2.connect();
  //  honorMagicV2.displayStatus();


  // 
  // 


  // SmartDevice honorMagicV2 = new SmartDevice("Honor", "Magic V2");
  // honorMagicV2.displayStatus();

  // SmartDevice smartLight = new SmartDevice("Hue", "Smart");

  // SmartDevice myDevice = new SmartDevice();

  // SmartDevice myOtherDevice = new SmartDevice("iphone", "11", 60);
  // myOtherDevice.displayStatus();


  // 
  // 

  // private method drive, can't use here
  // public accessible from any class
  // default (no private or public) accessible from classes in same package
  // Car2 myCar = new Car2();
  // myCar.drive();

  // justdrive calls drive method within class, making it accessible as it's default
  // myCar.justDrive();

  // variables can also be set to private, below is error
  // myCar.brand = "audi";

  
  // 
  // 


  // Car2 myCar = new Car2();
  // myCar.setBrand("audi");
  // myCar.displayDetails();

  Car2 myCar = new Car2("red");
  myCar.setBrand("audi");
  myCar.displayDetails();

  Car2 myCar2 = new Car2("red");
  myCar2.setBrand("toyota");
  myCar2.displayDetails();

  }
}
