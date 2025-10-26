// File: StudentDemo.java
public class StudentDemo {
    public static void main(String[] args) {

        // Create Student objects using different constructors
        Student s1 = new Student();
        Student s2 = new Student("Omar", 18);

        // Use setters to modify data
        s1.setName("Ali");
        s1.setAge(16);

        // Display info
        System.out.println(s1);
        System.out.println(s2);

        // Call a method
        s2.study();
        s2.study("Mathematics");
    }
}

// This class is NOT public, so it can live in the same file
class Student {
    // Attributes (fields)
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Student{name='" + name + "', age=" + age + "}";
    }
}
