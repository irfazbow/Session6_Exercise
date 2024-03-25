package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    static void removeTarget(int[] dataArray, int target) {
        int[] newArray = new int[dataArray.length];
        int newIndex = 0;

        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] != target) {
                newArray[newIndex] = dataArray[i];
                newIndex++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(newArray, newIndex)));
    }
    public static void main(String[] args) {
        int[] inputArray = {1, 1, 3, 4, 11, 11, 9, 13, 15};
        int inputTarget = 1;
        removeTarget(inputArray, inputTarget);

    }
}