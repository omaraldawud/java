//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Loops {
    public static void main(String[] args) {

double x2 = 19; double y = 2;

       int t;  // define
       int T = 10;  // define and init

        t = 11; // init
        int x = t + T;


// Sum numbers from 1 to 5 (1 + 2 +3 +4 + 5)
        int sum = 0;
        for (int i = 1 ; i <= 5 ; i++) {
              sum = sum +  i;
        }
        System.out.println("sum = " + sum);

        System.out.println("/n Using While Loop");
        int i = 0;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("/n Using do-While Loop");
        int counter = 0;
        do {
            System.out.println("counter = " + counter);
            counter++;
        } while (counter < 5);

    }
}

// javac SourceCode.java ==> SourceCode.class (bytecode)