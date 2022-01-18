package DataStructure;

import java.util.Arrays;

public class Copy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = arr; // Shallow Copy
        int[] arr3 = Arrays.copyOf(arr, arr.length); // Deep Copy

        System.out.println("Before chaning values");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        arr[2] = 11;
        arr[3] = 88;
        System.out.println("After chaning values");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(arr4));
    }
}
