package DataStructure;
import java.util.*;

public class SetPractice {
    
    public static void main(String[] args) {
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        set.add(new ArrayList<Integer>(Arrays.asList(1,2)));
        set.add(new ArrayList<Integer>(Arrays.asList(3,4)));

        System.out.println(set);
        System.out.println(set.contains(new ArrayList<Integer>(Arrays.asList(1,2))));
    }

}
