
// int values have a range of -2,147,483,648 to 2,147,483,647.


public class M22VarsParts12 {
    public static void main(String[] args) {
        //                                                  2,147,483,648 to 2,147,483,647
        // PART 1
        //
        int a = 2_000_000_000;
        int b = 2_000_000_000;
        int sum = a + b;

        System.out.println("a: " + a);
        System.out.println("SUM1: " + sum);

        // Fix:
        long sumLong = (long) a +  b;
        long sumLong2 = a + (long) b;
        System.out.println("SUM2: " + sumLong);
        // Casting either 'a' or 'b' as a long (or both) is mandatory: the temporary result of 'a + b'
        // should be stored as a long even before assigning to 'sumLong'!

        //
        // PART 2
        //
        long l1 = 10000;
        long l2 = 10000;

        //int result = l1 + l2;  --> doesn't compile!
        //System.out.println("Result: " + result);

        // Fix:
        int result = (int)  (l1 + l2);
        System.out.println("Result: " + result);
    }
}
