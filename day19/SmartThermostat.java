package day19;

public class SmartThermostat implements ControllableDevice {

  private boolean isOn = false;

  private double temperature = 25.0;

  @Override
  public void turnOn() {
    isOn = true;
    System.out.println("smart thermostat turned on");
  }

  @Override
  public void turnOff() {
    isOn = false;
    System.out.println("smart thermostat turned off");
  }

  @Override
  public void getStatus(){
    String status = isOn ? "ON" : "OFF";
    System.out.println("smart thermostat status: " + status + " , temp: " + temperature);
  }

  public void setTemperature(double temperature){
    this.temperature = temperature;
    System.out.println("temp set to: " + temperature);

  }
  
}
