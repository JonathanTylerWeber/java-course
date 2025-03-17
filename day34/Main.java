package day34;

public class Main {
  public static void main(String[] args) {
    
    // 
    // Spring simplifies Java development by managing tasks liek code organization, connections, and security
    // acts like a toolbox for devs offereing key features:

    // Dependency Injection (DI): automatically connects components, simplifying code
    // Aspect-Oriented Programming (AOP): manages cross cutting concerns liek logging without cluttering core logic
    // Spring MVC: separates the app into Model, View, and controller for easier management
    // Spring Boot: Speeds up setup by providing a pre-configured template for projects

    // Bean: bean is an object managed by spring, ensuring everything owrks together by connecting components within the app
    
    // Dependecny Injection (DI) decouples components by automatically managing dependecnies, making code flexible, maintainable, and easy to update


    // Inversion Of Control (IoC): let's the framework mangae the programs flow, not the dev
    // like hiring an event planner-you provide input and they handle everything
    // in a traditional setup, the application manages object creation and dependencies, with ioc the framework handles object creation, lifecycles, and dependency injection,making the code more flexible and easier to maintain

    // Dependency Injection (DI) provides a class with its dependencies from an external source instead of creating them internally
    // like a car recieving parts from suppliers, di delivers dependencies to a class
    // DI decouples classes from specific implementations, mkaing them more flexible, easier to test, and modify

    // without DI:
    // class Car {
    //   Engine engine = new Engine()
    // }

    // with DI:
    // class Car {
    //   private Engine engine;
    //   public Car(Engine engine){ //engine is injected into the car
    //     this.engine = engine;
    //   }
    // }

    // constructor based DI:
    // injects dependencies via a class's constructor, ensuring the required dependencies are provided att creation, making them mandatory
    // ensures dependencies at creation and supports immutability
    // can create complex constructors

    // setter based DI:
    // injects deps via setters after creation, ideal for optional or configurable dependencies
    // flexibility to modify dependecnies and optional deps
    // risk of inconsistent state if deps arent set in time, unclear which deps are mandatory

    // field based DI:
    // injects deps directly into fields using annotations like @Autowired, bypassing constructors and setters
    // simplifies code by removing construcots and setters, allows concise class definitions
    // less clarity on depsm harder to test and mock, can reduce flexibility and encapsulation



    // 
    // 


    // // constructor dep injection:
    // Engine myEngine = new Engine();
    // // Injecting dependency engine into car, (car doesnt create engine, its expecting it)
    // Car myCar = new Car(myEngine);
    // myCar.drive();


    // setter dep injection:
    // Engine myEngine = new Engine();
    // Car myCar = new Car();
    // myCar.setEngine(myEngine);
    // // must set engine before driving
    // myCar.drive();

    // ElectricEngine myEEngine = new ElectricEngine();
    // myCar.setEngine(myEEngine);
    // myCar.drive();



    // 
    // 
    // 


    GreetingServiceImpl greetingService = new GreetingServiceImpl();
    MessageService messageService = new MessageService();

    // setter dep injection
    greetingService.setMessageService(messageService);

    greetingService.sendGreeting();



    // 
    // 



    // when to use setter vs constructor DI:
    // 
    // DI provides external deps, promoting loose coupling and better maintainability, testability, and flexibility

    // Constructor based dep injection (CDI):
    // injects deps through constructor at object creation
    // when to use:
    // mandatory deps: constructor injection ensures essential deps are always provided 
    // Immutability: deps are fixed at creation, making class immutable
    // a messaging service that needs a sender (mandatory) should use CDI


    // Setter based dep injection (SDI):
    // injects deps into a class through setter methods after object creation
    // when to use:
    // optional deps, allows adding or modifying deps
    // flexibility: change deps through life cycle
    // email service with optional encryption

  }
}
