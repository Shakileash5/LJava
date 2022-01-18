package intro;

public class DataTypes {

    public static void main(String[] args) {

        // primitive data types - 8 types 
        // byte, short, int, long, float, double, boolean, char

        // byte - 8 bit - -128 to 127
        // used if it's certain that the value of a variable will be within -128 to 127, then it is used instead of int to save memory.
        byte myByte = 127;
        byte myByte2 = -128;
        System.out.println(myByte);
        System.out.println(myByte2);

        // short - 16 bit - -32768 to 32767
        // used If it's certain that the value of a variable will be within -32768 and 32767, then it is used instead of other integer data types (int, long).
        short myShort = 32767;
        short myShort2 = -32768;
        System.out.println(myShort);
        System.out.println(myShort2);

        // int - 32 bit - -2,147,483,648 to 2,147,483,647 or 2^31 to 2^31-1
        int myInt = 2147483647;
        System.out.println(myInt);

        // long - 64 bit - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 or 2^63 to 2^63-1
        long myLong = 9223372036854775807L; //Notice, the use of L at the end of -42332200000. This represents that it's an integral literal of the long type
        System.out.println(myLong);

        // float - 32 bit - -3.4E38 to 3.4E38 or 2^24 to 2^24-1
        float myFloat = 3.4E38f; // Notice, the use of f at the end of 3.4E38. This represents that it's a floating point literal of the float type
        System.out.println(myFloat);

        // double - 64 bit - -1.7E308 to 1.7E308 or 2^53 to 2^53-1
        double myDouble = 1.7E308;
        System.out.println(myDouble);
        
        // char - 16 bit - 0 to 65535
        char myChar = 'A';
        char numChar = 65;
        System.out.println(myChar);
        System.out.println(numChar);
        System.out.println((int)myChar);

    }

}

