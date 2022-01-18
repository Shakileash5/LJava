package intro;

public class Start{

    public static void main(String[] args){
        System.out.println("Hellow guys!!");
        int a = 10;
        int b = 20;

        System.out.println("a + b = " + (a + b));

        int arr[] = {1,2,3,4,5};
        int arr2[] = new int[5];
        arr2[0] = arr[0];
        for(int i = 1; i<arr.length; i++){
            arr2[i] = arr[i] + arr[i-1] ;
        }
        System.out.println(arr);
        for(int i = 0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        // long
        long l = 3L;
        // short
        short s = 3;
        // byte
        byte byt = 3;
        
        // ================ Integer Literal ================
        // binary
        int bin = 0b100010;
        System.out.println(bin);
        // binary
        int binaryNumber = 0b10010;
        // octal 
        int octalNumber = 027;

        // decimal
        int decNumber = 34;

        // hexadecimal 
        int hexNumber = 0x2F; // 0x represents hexadecimal
        // binary
        int binNumber = 0b10010; // 0b represents binary
        System.out.println(binNumber);
        System.out.println(hexNumber);
        System.out.println(decNumber);
        System.out.println(octalNumber);
        System.out.println(binaryNumber);

        // ================ Floating Point Literal ================
        // float
        float f = 3.4f;
        // double
        double large = 3.44;
        // long double 
        //long doubleNumber = 3.44;
        // exponential
        double exp = 3.456e3;

        System.out.println(f);
        System.out.println(large);
        //System.out.println(doubleNumber);
        System.out.println(exp);
        
        // ================ Character Literal ================
        char c = 'a';
        char c2 = '\u0061';
        char c3[] = {'a', 'b', 'c'};
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        // ================ String Literal ================
        String str2 = "Hello";
        System.out.println(str2.charAt(0));
   }
}