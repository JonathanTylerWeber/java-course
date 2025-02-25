package day18;

// child/ sub class
public class Dog extends Animal {
  String breed;

  public Dog(String name, String breed){
    super(name);
    this.breed = breed;
    System.out.println("Dog constructor called, the breed is " + breed);
  }

  void eat(){
    System.out.println("This dog eats food");
  }

  void animalEat(){
    super.eat();
  }

  void bark(){
    System.out.println("This dog barks");
  }
}
