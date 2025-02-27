package day19;

// child/ sub class
public class Dog extends Animal {
  String breed;

  public Dog(String name, String breed){
    super(name);
    this.breed = breed;
    System.out.println("Dog constructor called, the breed is " + breed);
  }

  @Override
  void eat(){
    super.eat();
    System.out.println("This dog eats food");
  }

  void animalEat(){
    super.eat();
  }

  @Override
  void makeSound(){
    System.out.println(name + " the dog is barking");
  }

  void fetch() {
    System.out.println(name + " is fetching the ball");
  }
}
