package day37;

// type parameter T
// bounded generic
// Number: double, float, etc

public class NumberPrinter <T extends Number> {
  T whatToPrint;

  public NumberPrinter(T whatToPrint){
    this.whatToPrint = whatToPrint;
  }

  public void print(){
    System.out.println(whatToPrint);
  }


}
