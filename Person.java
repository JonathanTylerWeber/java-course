// Sevan Sevo

public class Person {
  private String name;
  private int age;
  private double heightM;

  public Person() {}

  public Person(String name, int age, double heightM) {
    this.name = name;
    this.age = age;
    this.heightM = heightM;
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return "name: " + name + " age: " + age + " height: " + heightM;
  }
  

  public static void main(String[] args){
    Person sevo = new Person();
    sevo.age = 12;
    sevo.name = "Sevo";
    sevo.heightM = 1.8;
    Person jonathan = new Person("Jonathan", 26, 1.8 );
    System.out.println(sevo.toString());
    System.out.println(jonathan);
  }
}