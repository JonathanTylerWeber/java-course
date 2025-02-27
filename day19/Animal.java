package day19;

// Super/parent/base class
public class Animal {
  String name;

  public Animal(String name){
    this.name = name;
    System.out.println("Animal constructor called for " + name);
  }

  void eat(){
    System.out.println("This animal eats food");
  }

  void sleep(){
    System.out.println(name + " is sleeping");
  }

  void makeSound(){
    System.out.println(name + " is making a sound");
  }
}
