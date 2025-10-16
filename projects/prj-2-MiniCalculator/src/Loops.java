//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Loops {
    public static void main(String[] args) {
        System.out.println("/n Using FOR Loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

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
