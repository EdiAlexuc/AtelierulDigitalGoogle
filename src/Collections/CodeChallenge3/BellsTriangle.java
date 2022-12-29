package Collections.CodeChallenge3;

import java.util.ArrayList;
import java.util.List;

public class BellsTriangle {
    public static void main(String[] args) {
        int n = 5; // number of rows to generate

        List<List<Integer>> triangle = new ArrayList<>();

        //intialize the first row value with 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        //generate the remaining rows
        for (int i = 1; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1); // add the first element in the row
            for (int j = 1; j < i; j++) {
                //add the sum of the two elements above it in the previous row
                int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 2).get(j - 1);
                row.add(value);
            }
            row.add(1); // add the last element in the row
            triangle.add(row);
        }
        //print the traingle
        for (List<Integer> row : triangle) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
