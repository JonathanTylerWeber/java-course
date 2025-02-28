package day19;

public interface ControllableDevice {
  
  void turnOn();

  void turnOff();

  default void getStatus(){
    System.out.println("Status: unknown");
  }


  
}
