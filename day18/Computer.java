package day18;

public class Computer extends Device {
  int ram;
  int storage;

  public Computer(String brand, String model, int ram, int storage){
    super(brand, model);
    this.ram = ram;
    this.storage = storage;
  }

  @Override 
  void powerOn(){
    System.out.println("Computer is turning on");
  }

  @Override
  void displayInfo(){
    super.displayInfo();
    System.out.println("Ram: "  + ram);
    System.out.println("Storage: "  + storage);
  }
}
