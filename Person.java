public class Person {
  public String first;
  public String last;

  public Person(String first, String last) {
    this.first = first; // instance variables aka change based on instantiation and invocation of a new object
    this.last = last;
  }

  public String fullName() {
    return this.first + " " + this.last;
  }

  public static void main(String[] args) {
    Person jdoe = new Person("John", "Doe");
    System.out.println(jdoe.fullName());
  }
}
