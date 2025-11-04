public class Student2 {
    private String name;
    private int age;

    public Student2() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void study() {
        System.out.println(name + " is studying.");
    }

    public void study(String subject) {
        System.out.println(name + " is studying " + subject + ".");
    }

    @Override
    public String toString() {
        return "Student2{name='" + name + "', age=" + age + "}";
    }
}
