package intro;

public class Operators {

    public static void main(String[] args) {
        // declare variables
        int a = 12, b = 5;

        // addition operator
        System.out.println("a + b = " + (a + b));

        // subtraction operator
        System.out.println("a - b = " + (a - b));

        // multiplication operator
        System.out.println("a * b = " + (a * b));

        // division operator
        System.out.println("a / b = " + (a / b));

        // modulo operator
        System.out.println("a % b = " + (a % b));

        // increment operator
        System.out.println("a++ = " + (a++));
        System.out.println("a = " + a);

        // decrement operator
        System.out.println("a-- = " + (a--));
        System.out.println("a = " + a);

        System.out.println("9.0/2 = " + (9.0/2));
        System.out.println("9/2 = " + (9/2));
        System.out.println("9.0/2.0 = " + (9.0/2.0));
        System.out.println("9/2.0 = " + (9/2.0));


        // bitwise operators
        int c = 12, d = 5;
        System.out.println("c = " + c);

        // bitwise AND operator
        System.out.println("c & d = " + (c & d));

        // bitwise OR operator
        System.out.println("c | d = " + (c | d));

        // bitwise XOR operator
        System.out.println("c ^ d = " + (c ^ d));

        // bitwise NOT operator
        System.out.println("~c = " + (~c));

        // Left shift operators
        System.out.println("c << 2 = " + (c << 2));

        // Right shift operators
        System.out.println("c >> 2 = " + (c >> 2));


    }

}
