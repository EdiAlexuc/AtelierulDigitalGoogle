package Basics.CodeChallenge4;

import java.util.ArrayList;
import java.util.List;

/*  We initialize a variable to store the number of pairs found to 0.
    Then loop through the array and for each element
    check if there is another 2 elementS in the array when added result 0
    If there is, increment the pair count and mark the elements as used,
    so they won't be used in te future
*/

public class PairsOf3 {

    public static int findPairs(int[] numbers) {
        int pairCount = 0;
        List<Integer> usedNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            //check if we already used the numbers
            if (usedNumbers.contains(numbers[i])) {
                continue;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                if (usedNumbers.contains(numbers[j])) {
                    continue;
                }
                for (int k = j + 1; k < numbers.length; k++) {
                    if (usedNumbers.contains(numbers[k])) {
                        continue;
                    }

                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        pairCount++;
                        usedNumbers.add(numbers[i]);
                        usedNumbers.add(numbers[j]);
                        usedNumbers.add(numbers[k]);
                    }
                }
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{-1, -1, -1, 2,};
        System.out.println(findPairs(numbers));
    }
}
