public class M2BasicVars {
        public static void main(String[] args) {

            // Primitive Data Types - part of the compiler
            boolean b = true;               // true, false are reserved fo boolean only.
            char c = 'C';                   // char - 2 bytes (16bits) Bytecode  'c'
            byte bt = 127;                  // byte -  1 byte (8 bits) 2 to the power of 2  LARGEST VALUE 256

            short s = 32767;
            int i = 2_000_000_000;          // 4bytes = 32 bits - 2 to the poser 32
            long l = 123456789123456789L;   // 8bytes = 64 bits - 2 to the poser 64
            float f = 25.0f;                //
            double d = 0.1;

            System.out.println("boolean: " + b);
            System.out.println("char: " + c);
            System.out.println("byte: " + bt);
            System.out.println("short: " + s);
            System.out.println("int: " + i);
            System.out.println("long: " + l);
            System.out.println("float: " + f);
            System.out.println("double: " + d);

            final double PI;     //constant thabet - doe not change
            PI = 3.14;

            // PI = 3.1415926536; --> can't modify a final variable!
        }


}
