package day35;

public class Main {
  public static void main(String[] args) {
    // Spring Beans
    // a java object managed by the Spring framework, handling logic, configurations, or utilities

    // they are important because of :
    // Automatic Object Management, they control the life cycle of objects, bean creation, injection, and destruction
    // Dep Injection: components automatically receive required resources
    
    // in an app, components interact and w/o spring benas you'd manually create and link them

    // the IOC (inversion of control) container in spring is responsible for mangaing the lifecycle, config, and deps of spring beans, hanlding creation and injection to promote losse coupling and flexibility in the app

    // ****
    // Spring bean lifecycle:

    // Instantiation : created
    // spring identifies which beans are needed
    // creates instances of beans following config

    // Initialization: setup and made ready for use
    // spring injects required resources (other beans)
    // ensures bean can function within the app
    // beans stored in spring IOC container

    // Destruction: bean no longer needed, spring takes it down and frees up resources
    // ensures efficient use of resources
    // crucial for maintaining app efficiency



    // IOC Container
    // shifts object creation and management to the framework, enabling flexible, maintainable, and testable code
    // Application Context: core of IOC, manages beans, dep injection, and advanced features

    // eager initialization. spring preloads singleton beans during app startup, ensuring theyre ready when needed
    // internationalization: manages multilingual support, allowing apps to display messages based on user location or language preference
    // resource loading: spring loads resources like files or data from various locations such as file system, class path, or urls
    // spring expression language (SpeL): provides dynamic flexible configs, allowing conditional bean setups based on specific criteria

    

  }
}
