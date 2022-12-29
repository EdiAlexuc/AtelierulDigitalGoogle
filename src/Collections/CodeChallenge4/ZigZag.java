package Collections.CodeChallenge4;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(1);
        for(int i = 1 ; i < list.size(); i++){
            // if the current element is greater than the previous element, swap them
            if((i%2 == 0 && list.get(i) > list.get(i-1)) || (i%2 ==1 && list.get(i) < list.get(i-1))){
                int temp = list.get(i);
                list.set(i, list.get(i-1));
                list.set(i-1, temp);
            }
        }
        for(int value : list){
            System.out.print(value + " ");
        }
    }
}
