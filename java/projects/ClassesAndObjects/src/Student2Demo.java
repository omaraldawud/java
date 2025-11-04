// classes live in separate files
public class Student2Demo {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Omar", 18);

            s1.setName("Ali");
            s1.setAge(16);

            System.out.println(s1);
            System.out.println(s2);

            s2.study();
            s2.study("Mathematics");
        }
    }