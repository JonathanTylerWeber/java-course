package day37;

public class Main {
  public static void main(String[] args) {
    
    // Generics and Bounded Types
    // ********


    // can do this with generic type instead of separate printers for each type
    Printer<Float> floatPrinter = new Printer<Float>(3.14f);
    floatPrinter.print();

    Printer<Double> doublePrinter = new Printer<Double>(122.23);
    doublePrinter.print();

    Printer<String> stringPrinter = new Printer<String>("howdy");
    stringPrinter.print();


    // bounded
    NumberPrinter<Double> numberPrinter = new NumberPrinter<Double>(132.0);
    numberPrinter.print();

    // can only do numbers (cant do strings)
    // NumberPrinter<String> numberPrinter1 = new NumberPrinter<String>("hi");
    // numberPrinter.print();


    print2(123, "Hello");
    

  }


  // Generic Method
  public static <T> void print1(T whatToPrint1){
    System.out.println(whatToPrint1);
  }

  public static <T, U> void print2(T first, U second){
    System.out.println("first: " + first + " second: " + second);
  }
}
