package day19;

public class Main {
  public static void main(String[] args) {
    // Hierarchical inheritance
    // Dog myDog = new Dog("Buddy", "Golden Retriever");
    // myDog.eat(); //overriden eat method
    // myDog.makeSound(); //dog specific sound
    // myDog.fetch(); //dog specific behavior
    // myDog.sleep(); //inherited from animal


    // 
    // 


    // Dog myDog = new Dog("Buddy", "Golden Retriever");

    // // polymorphism, 
    // // since dog is an animal, can create object of type animal that will be a dog
    // Animal myDog2 = new Dog("Jenny", "Collie");
    
    // // polymorphic call:
    // //this will still say dog bark but methods only on dog won't work, will need to be cast as dog
    // myDog2.makeSound();

    // // can do animal things but can't do things only dog can do (it's still an animal), must cast as dog 
    // // casting to be dog, direct call of subclass specific method (requires casting to appropriate subclass)
    // ((Dog) myDog2).fetch();


    //
    //

    // compiler determines which method is called
    Calculator calculator = new Calculator();
    int sum1 = calculator.add(5, 10);
    System.out.println("sum1 " + sum1);

    double sum2 = calculator.add(5.5, 10.3);
    System.out.println("sum2 " + sum2);

    int sum3 = calculator.add(5, 10, 25);
    System.out.println("sum3 " + sum3);

  }
}
