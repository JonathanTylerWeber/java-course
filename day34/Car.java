package day34;

public class Car {
  private Engine engine;

  // construcor DI
  // public Car(Engine engine){
  //   this.engine = engine; // loosely coupled, more flexible, modular, can use different engines etc
  // }

  // setterDI

  public Car(){
  }

  public void setEngine(Engine engine){
    this.engine = engine;
  }

  public void drive(){
    engine.start();
    System.out.println("car is driving");
  }

}
