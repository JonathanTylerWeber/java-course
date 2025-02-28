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

    // compiler determines which method is called (static polymorphism/method overloading)
    // Calculator calculator = new Calculator();
    // int sum1 = calculator.add(5, 10);
    // System.out.println("sum1 " + sum1);

    // double sum2 = calculator.add(5.5, 10.3);
    // System.out.println("sum2 " + sum2);

    // int sum3 = calculator.add(5, 10, 25);
    // System.out.println("sum3 " + sum3);


    // 
    // 


    // // dynamic polymorphism happens at runtime, not compile time
    // Animal[] animals = new Animal[3];

    // animals[0] = new Animal("cat"); //base class
    // animals[1] = new Dog("Buddy", "Golden Retriever"); //class derived from animal
    // animals[2] = new Bird("birdie"); //class derived from animal

    // for (Animal animal : animals){
    //   animal.makeSound(); //dynamic method in dispatch
    // }

    // // this is static polymorphism
    // Animal paul = new Bird("paul");
    // paul.makeSound();


    // 
    // 


    // // running abstract methods
    // Payment creditCardPayment = new CreditCardPayment();
    // Payment paypalPayment = new PayPalPayment();

    // creditCardPayment.processPayment(100.00);
    // paypalPayment.processPayment(50.00);


    // 
    // 



    // ControllableDevice light = new SmartLight();
    // ControllableDevice thermostat = new SmartThermostat();

    // light.turnOn();
    // light.getStatus();

    // thermostat.turnOn();
    // // cant set temp because its a controllable device and set temp doesnt exist on that, must cast as smart thermostat
    // ((SmartThermostat) thermostat).setTemperature(20.0);
    // thermostat.getStatus();

    // abstract class: cant be instantiated, is blueprint for subclasses
    // interface: cant be instantiated, is contract for implementing classes

    // abstract class: can have both abstract and concrete methods
    // interface: contains abstract methods, supports default and static methods

    // abstract class: can have member variables (instance vars) for shared data
    // interface: only constants (public, static, final) cant be changed

    // abstract class: supports single inhjerticance (one class)
    // interface: supports multiple inheritance (mulitple interfaces can be inherited from)

    // abstract class: flexible access modifiers for methods and variables
    // interface: methods are public and abstract, variables are public, static, and final

    // abstract class: can have constructors for initialization
    // interface:no constructors

    // abstract class: provides partial implementation w concrete methods
    // interface: no implementation pre java 8, default and static methods allowed from java 8

    // whent to use:
    // abstract class: common base class with shared code and behavior
    // interface: defining a contract especially when multiple inheritance is needed



    // 
    // 


    // MessageService emailService = new EmailService();
    // MessageService smsService = new SMSService();

    // emailService.sendMessage("Hello", "alice@gmail.com");
    // smsService.sendMessage("Hi uwuw", "123-456-7890");


    // 
    // 


    // Encapsulation: binding methods and vars
    // encapsulation in oop bundles data and methods into a class, 
    // restricting direct acces using access specifiers like private, protected, public

    // key benefits, data hiding: protects internal state from unatuhorized access
    // modularity
    // maintainability
    // control

    // for example, can only set username email and password from methods within user class(some vars and methods are private)

  }
}
