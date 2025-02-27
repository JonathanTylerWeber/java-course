package day19;

public class Bird extends Animal {
  public Bird(String name){
    super(name);
    System.out.println("Bird Constructor called");
  }

  @Override
  void eat(){
    super.eat();
    System.out.println(name + " the bird is pecking at seeds");
  }

  @Override
  void makeSound(){
    System.out.println(name + " the bird is chirping");
  }

  void fly(){
    System.out.println("This bird can fly");
  }

  
}
