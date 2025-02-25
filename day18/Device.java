package day18;

public class Device {
  String brand;
  String model;

  public Device(String brand, String model){
    this.brand = brand;
    this.model = model;
  }
  void powerOn(){
    System.out.println("Device is turning on");
  }

  void displayInfo(){
    System.out.println("Brand: "  + brand);
    System.out.println("Model: "  + model);
  }
}
