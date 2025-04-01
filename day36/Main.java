package day36;

public class Main {
  public static void main(String[] args) {
    // AutoWiring:

    // automatically injects deps into your classes without extra code
    // auto dependency resolution: spring scans and injects required beans
    // flexible injection: brans are injected via constructors, setters, or fields
    // type/name matching: matches beans by type or name

    // scalable architecture
    // flexible deps, easy to swap components

    // *******
    // no autowiring
    // public class Car {
    //   private Engine engine;

    //   public Car() {
    //     this.engine = new Engine();
    //   }
    // }

    // *****
    // autowiring (field injection)
    // @Component
    // public class Car {

    //   // The Engine dependency is injected directly on the field
    //   @Autowired
    //   private Engine engine;

    //   // Car methods using engine
    // }



    // *****
    // types of autowiring modes:

    // 1.autowiring by type (@Autowired)
    // spring injects deps based on the beans type (eg. Engine)
    // ideal when only one bean of the required type exists in the context
    
    // ****
    // code example
    //  @Component
    // public class Engine {
    //   // Engine implementation
    // }
    // 
    // @Component
    // public class Car {
    //    @Autowired
    //    private Engine engine
    //    // ...
    // }

    // spring injects Engine into Car automatically based on it's type, no extra config needed
    // ****



    // 2. Autowiring by name (@Autowired)
    // spring injects beans by matching the field name with the bean name
    // use when multiple beans of same type exist and you need a specific one

    // ****
    // code example
    // @Component
    // public class DieselEngine implements Engine {
    //   // DieselEngine implementation
    // }
    // 
    // @Component
    // public class PetrolEngine implements Engine {
    //   // PetrolEngine implementation
    // }
    // 
    // @Component
    // public class Car {
    //   @Autowired
    //   private Engine dieselEngine;
    //   //...
    // }
    // 
    // with two engine beans, naming the field dieselEngine tells srping to inject the matching bean into car
    // ****



    // 3. Autowiring by constructor 
    // spring injects deps via the constructor, ensuring all required parts are present at creation
    // use when all available deps must be available at object creation

    // ****
    // code example
    // @Component
    // public class Engine {
    //    //engine implementation
    // }
    // 
    // @Component
    // public class Car{
    //    privat Engine engine;
    // 
    //    @Autowired
    //    public Car(Engine engine){
    //      this.engine = engine;
    //    }
    // }
    // 
    // spring calls the car constructor, providing the engine bean, ensuring Car is created with a required engine
    // ****
    



    // 4. no Autowiring (Manual Wiring)
    // autowiring is off, deps are manually specified using @Qualifier for full control
    // use when precise control over bean injection is needed

    // @Component
    // public class Car{
    //    private Engine engine;
    // 
    //    public void setEngine(Engine engine){
    //        this.engine = engine;
    //    }
    // }
    // 
    // the Car class doesnt use Autowired, you manually call the setEngine() method to inject the Engine bean
    // ****


    


    // Annotations in Spring: @Component and @Service
    // spring annotations simplify configuration by guiding how to manage classes, methods, or fields
    
    // @Component:
    // marks a class as a spring bean, anabling automatic detection and dep injection
    // used when you want spring to manage a class as a bean without a specific role like service or repository

    // spring uses component scanning to find @Component classes, you can specify a base package for scanning:
    // @ComponentScan('base.example')
    // public class AppConfig{}


    // @Service:
    // marks a class for business logic in the service layer, improving readability
    // used for classes handling business logic, clarifying their role


    // @Configuration:
    // marks a class as a source of bean definitions for spring IoC

    // @Bean:
    // defines beans, but autowiring can auto detect and wire them without explicit definitions


    // @ComponentScan:
    // tells spring where to look for components like @Service, @Component, etc
    // automates bean registration by scanning and detecting annotated classes





  }
}
