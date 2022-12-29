package Basics.CodeChalleng3;

import java.util.ArrayList;
import java.util.List;

/*  We initialize a variable to store the number of pairs found to 0.
    Then loop through the array and for each element
    check if there is another element in the array that is its negative
    If there is, increment the pair count and remove both elements
 */

public class PairOf2 {


    public static int findPairs(int[] numbers){
        int pairCount = 0;

        //create an arraylist to store the array and remove the pairs
        List<Integer> remainingNumbers = new ArrayList<>();

        for(int number : numbers){
            remainingNumbers.add(number);
        }
        while(!remainingNumbers.isEmpty()){
            int x = remainingNumbers.remove(0);
            if(remainingNumbers.contains(-x)){
                pairCount++;
                remainingNumbers.remove(Integer.valueOf(-x));
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {

        int[] numbers = new int[]{3, 2, -3, -2, 3, 0};
        System.out.println(findPairs(numbers));
    }
}
