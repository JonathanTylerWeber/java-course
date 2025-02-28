package day19;

public class SmartLight implements ControllableDevice {

  private boolean isOn = false;

  @Override
  public void turnOn() {
    isOn = true;
    System.out.println("smart light turned on");
  }

  @Override
  public void turnOff() {
    isOn = false;
    System.out.println("smart light turned off");
  }

  @Override
  public void getStatus(){
    String status = isOn ? "ON" : "OFF";
    System.out.println("smart light status: " + status);
  }
  
}
