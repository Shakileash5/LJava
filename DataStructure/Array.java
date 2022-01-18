package DataStructure;
import java.util.*;

public class Array {

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[0]);

        int numbers[] = {1,2,3};

        for(int num: numbers){
            System.out.println(num);
        }

        int numbers2d[][] = {
            {1,2},
            {3,4}
        };

        for(int[] nums: numbers2d){
            for(int num: nums){
                System.out.println(num);
            }
        }

        // Array list
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(89);
        list.add(76);
        System.out.println(list);
        System.out.println(list.get(0));
        
        for(int num: list){
            System.out.println(num);
        }

        // Multidiimensional array
        int multiDim[][] = {
            {1,2,3},
            {4,5,6,10,11},
            {7,8,9,0}
        };
        System.out.println(multiDim[0].length);
        System.out.println(multiDim[1].length);
        System.out.println(multiDim[2].length);



    }
    
}
