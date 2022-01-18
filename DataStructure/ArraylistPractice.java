package DataStructure;
import java.util.*;

public class ArraylistPractice {

    public static void change_arr(int[] arr) {
        arr[0] = 100;
    }


    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        Integer[] arr = {1,2,3,4,5};
        
        // Convert string array to list
        String[] array = {"Java", "Python", "C"};   
        ArrayList<String> languages= new ArrayList<>(Arrays.asList(array));
        
        // convert array to list
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr));

        // convert array to list
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(list2);

        list.add(100);
        list.add(200);
        list.add(300);

        // add element at specific index
        list.add(1, 400);
        System.out.println(list);

        // remove element at specific index
        list.remove(1);
        System.out.println(list);

        // remove element at specific index
        list.remove(list.indexOf(300));
        System.out.println(list);
        
        // convert arraylist to array
        Integer[] arr2 = new Integer[list.size()];
        list.toArray(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1,2,3,4,5};
        ArraylistPractice.change_arr(arr3);
        System.out.println(Arrays.toString(arr3));
    }


}
