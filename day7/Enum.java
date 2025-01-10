package day7;

public class Enum {

  public enum Day {
    MONDAY, TUESDAY
  }

  public enum CoffeeSize {
    SMALL, MED, LG
  }

  public static void main(String[] args) {
    CoffeeSize size = CoffeeSize.LG;

    double price;
    switch(size){
      case SMALL:
        price = 2.50;
        break;
      case MED:
        price = 3.50;
        break;
      case LG:
        price = 4.50;
        break;
      
      default:
        price = 420.69;
        break;
    }

    // System.out.println("the price for your coffee is: " + price);
    System.out.printf("the price for your coffee is: $%.2f%n", price);

  }
}
