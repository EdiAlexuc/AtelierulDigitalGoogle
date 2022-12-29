package Collections.CodeChallenge5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergedSortedLists {
    public static void main(String[] args) {
        // create the first list
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(6);

        // create the second list
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        // merge the lists and sort the result
        list1.addAll(list2);
        Collections.sort(list1);

        // print the merged and sorted lists
        System.out.println(list1);
    }
}
