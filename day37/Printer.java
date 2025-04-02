package day37;

// type parameter T

public class Printer <T> {
  T whatToPrint;

  public Printer(T whatToPrint){
    this.whatToPrint = whatToPrint;
  }

  public void print(){
    System.out.println(whatToPrint);
  }


}
