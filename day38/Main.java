package day38;

public class Main {
  public static void main(String[] args) {
    // *************** 
    // constructor based di:
    // passes deps through constructor with spring autowiring them

    // pros:
    // immutability - dpes cant be modified
    // testing- easy to mock deps
    // clear contract - construcotr listas all deps
    // fail fast - detects missing deps early
    // simplified managment - easier to handle multiple deps

    // why better for large projects:
    // centralizes and simplifies managing deos in complex projects


    // *************** 
    // field based di:
    // passes deps directly into fields using autowired

    // pros:
    // simplicity- requires less code, no need for consturcotrs
    // ideal for small projects

    // cons:
    // harder to test and mock deps
    // hidden dpes - dpes aren't clearly listed in one place
    // no immutability, fields cant be final so deps can be modified
    // not scalable
    
    
    // WHEN TO USE
    // constructor based:
    // larger apps, testing, multiple deps
    
    // field based:
    // small apps, focusing on simplicity



    // **************
    // @Qualifier
    // annotation in spring specifies which bean to inject when multiple beans exist
    // resolves ambiguity

    // @Primary 
    // sets a default bean when mulitiple beans exist, reduces need for @Qualifier
    // global default


  }
}
