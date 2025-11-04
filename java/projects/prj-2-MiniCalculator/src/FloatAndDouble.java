public class FloatAndDouble {
    public static void PrecisionLossExample(){
        // --- Using double (high precision) ---
        System.out.println("--- Using double ---");
        double largeDouble = 100000000.0;
        double smallDouble = 0.123456789;
        double resultDouble = largeDouble + smallDouble - largeDouble;

        System.out.println("Result with double: " + resultDouble);
        System.out.println("Expected result:    " + smallDouble);
        System.out.println();

        // --- Using float (low precision) ---
        System.out.println("--- Using float ---");
        float largeFloat = 100000000.0f;
        float smallFloat = 0.123456789f;
        float resultFloat = largeFloat + smallFloat - largeFloat;

        System.out.println("Result with float:  " + resultFloat);
        System.out.println("Expected result:    " + smallFloat);
    }

    public static void main (String[] args) {
                float myFloat = 3.1415926535f; // Requires 'f' suffix
                double myDouble = 3.141592653589793;

                System.out.println("Float value: " + myFloat);
                System.out.println("Double value: " + myDouble);

        System.out.println("------------------- ex2 ------------------");
        PrecisionLossExample();
    }



}

