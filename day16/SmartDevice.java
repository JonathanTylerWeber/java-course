package day16;

public class SmartDevice {
  // member variables (fields, attributes)
  String brand;
  String model;
  int batteryLife = 0;
  boolean isConnected = false;
  
  // default constructor (initialized when instance/object is created)
  // public SmartDevice(){
  //   System.out.println("Smart Device created");
  //   brand = "Unknown";
  //   model = "Unknown";
  // }

  // parameterized constructor (the creator of object gives info about object)
  // public SmartDevice(String myBrand, String myModel){
  //   System.out.println("Smart Device created " + myBrand + " " + myModel);
  //   brand = myBrand;
  //   model = myModel;
  // }

  // using 'this' keyword
  public SmartDevice(String brand, String model){
    System.out.println("Smart Device created " + brand + " " + model);
    this.brand = brand;
    this.model = model;
  }

  // constructor overload, can create without variables or extra
  public SmartDevice(){
    System.out.println("Device created without details");
    brand = "Uknown";
    model = "Uknown";
  }

  public SmartDevice(String brand, String model, int batteryLife){
    System.out.println("Smart Device created " + brand + " " + model);
    this.brand = brand;
    this.model = model;
    this.batteryLife = batteryLife;
  }

  // member methods
  void connect(){
    System.out.println("connecting device");
    isConnected = true;
  }
  
  void disconnect(){
    System.out.println("disconnecting device");
    isConnected = false;
  }

  void displayStatus(){
    System.out.println("Brand: " + brand);
    System.out.println("model: " + model);
    System.out.println("batteryLife: " + batteryLife);
    System.out.println("isConnected: " + isConnected);
  }

}
