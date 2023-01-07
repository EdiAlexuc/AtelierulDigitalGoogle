package DesignPatterns.CodeChallenge2;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{

    @Override
    public void sort(Integer[] list){
        if(list.length > 1){
            int mid = list.length / 2;
            Integer[] left = Arrays.copyOfRange(list, 0, mid);
            Integer[] right = Arrays.copyOfRange(list, mid, list.length);
            sort(left);
            sort(right);
            merge(list, left, right);
        }
    }

    private void merge(Integer[] list, Integer[] left, Integer[] right){
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;
        while (leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex] < right[rightIndex]){
                list[listIndex] = left[leftIndex];
                leftIndex++;
            } else {
                list[listIndex] = right[rightIndex];
                rightIndex++;
            }
            listIndex++;
        }
        while (leftIndex < left.length){
            list[listIndex] = left[leftIndex];
            leftIndex++;
            listIndex++;
        }
        while (rightIndex < right.length){
            list[listIndex] = right[rightIndex];
            rightIndex++;
            listIndex++;
        }
    }
}
