public class Main {
    public static void main(String[] args) {

        byte b1 = 12;
        byte b2 = -7;
        short s1 = 12045;
        short s2 = -8620;
        long l1 = 2337203685477L;
        long l2 = -9223372036L;
        double d1 = 5.368584;
        double d2 = 233.7203685477;
        float f1 = -7.95f;
        float f2 = 65.254f;

        System.out.println();
        System.out.printf("initial byte variables: %d, %d%n", b1, b2);
        System.out.printf("initial short variables: %d, %d%n", s1, s2);
        System.out.printf("initial long variables: %d, %d%n", l1, l2);
        System.out.printf("initial double variables: %f, %f%n", d1, d2);
        System.out.printf("initial float variables: %f, %f%n", f1, f2);

// Addition (Finding the Sum; '+')

        System.out.println();
        System.out.println( "The Sum of:");
        System.out.println( "byte variables = "+ (b1 + b2) );
        System.out.println( "short variables = "+ (s1 + s2) );
        System.out.println( "long variables = "+ (l1 + l2) );
        System.out.println( "double variables = "+ (d1 + d2) );
        System.out.println( "float variables = "+ (f1 + f2) );
        System.out.println( "===================================");

// Subtraction (Finding the difference; '-')

        System.out.println();
        System.out.println( "The difference of:");
        System.out.println( "byte variables = "+ (b1 - b2) );
        System.out.println( "short variables = "+ (s1 - s2) );
        System.out.println( "long variables = "+ (l1 - l2) );
        System.out.println( "double variables = "+ (d1 - d2) );
        System.out.println( "float variables = "+ (f1 - f2) );
        System.out.println( "===================================");

// Multiplication (Finding the product; '×' )

        System.out.println();
        System.out.println( "The product of:");
        System.out.println( "byte variables = "+ (b1 * b2) );
        System.out.println( "short variables = "+ (s1 * s2) );
        System.out.println( "long variables = "+ (l1 * l2) );
        System.out.println( "double variables = "+ (d1 * d2) );
        System.out.println( "float variables = "+ (f1 * f2) );
        System.out.println( "===================================");

// Division (Finding the quotient; '÷')

        System.out.println();
        System.out.println( "The quotient of:");
        System.out.println( "byte variables = "+ (b1 / b2) );
        System.out.println( "short variables = "+ (s1 / s2) );
        System.out.println( "long variables = "+ (l1 / l2) );
        System.out.println( "double variables = "+ (d1 / d2) );
        System.out.println( "float variables = "+ (f1 / f2) );
        System.out.println( "===================================");
    }
}