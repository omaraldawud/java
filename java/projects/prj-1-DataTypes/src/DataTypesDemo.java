
public class DataTypesDemo {
    public static void main(String[] args) {        // starting point of execution
        String name = "Farhan";
        int age = 19;                               // init value - init 4 bytes 32 bits
        char grade = 'A';                           // Bytecode 2 bytes

        double height = 183.6;                      // 8 bytes
        boolean likesMath = false;                  // one bit , true or false
        boolean likesEnglish = false;
        boolean likesScience = false;

        String almi = "Almi";
        String adabi = "adabi";

        // expression
        age = age + 10;     //expression
        height = height + 6;

// Step 2: Print statements
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + name);
        System.out.println(name + "'s age after 10 years is: " + age);
        System.out.println("Height: " + height + " meters");
// Step 3: Boolean checks - conditional
        if (likesMath) {
            System.out.println(name + " likes Math!");
        } else {
            System.out.println(name + " does not like Math.");
        }

        //
        if (!likesEnglish) {
            System.out.println(name + " does not like English.");
        }
        if  (!likesScience)
            System.out.println(name + " is: " + adabi);
        else
            System.out.println(name + " is: " +  almi);
    }
}


