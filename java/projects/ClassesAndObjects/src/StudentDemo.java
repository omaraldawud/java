// File: StudentDemo.java
public class StudentDemo {
    public static void main(String[] args) {

        // Create Student objects using different constructors
        // class template for objects

        Student s1 = new Student();                 // new keyword is a factory of object - it creates object
        Student s2 = new Student();
        Student s3 = new Student("omar", 60);
        Student s4 = new Student("Omar");
        Student s5 = new Student ("omar", 60, 4.8);  // String, int, double
    }
}
////////////////////////////////////////////////////////////////////////////////////////
// This class is NOT public, so it can live in the same file
class Student {

    // Attributes (fields)  - encapsulation private fields and public methods -  setters and getters setName(), getName()
    private String name;            // OOD - we must implement encapsulation make all attributes (name, age) private.
    private int age;
    private double gpa = 4.0;
    private boolean isGrad = false;

  //Functions
  // Default constructor -  special function used to create objects using the new operator.
  public Student( ) {
      this.name = "no name";
      this.age = 0;
  }

  // Parameterized constructor - this is an overloaded funciton
      public Student(String name, int age) {
          this.name = name;
          this.age = age;
      }

    // Parameterized constructor - this is an overloaded funciton
    public Student(String name) {
        this.name = name;
        this.age = 0;
    }

    // PArameterized (overloaded)
    public Student (String name, int age, double gpa) {

    }
    // Getters and setters
    public String getName() {
          return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //GPA
    public double getGpa() {
      return this.gpa;
    }
    public void setGpa(double ngpa) {
          this.gpa = ngpa;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods (actions)
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void study(String subject) {
        System.out.println(name + " is studying " + subject + ".");
    }

    // toString() method
    @Override
    public String toString() {
        return  name +   age;
    }
}
