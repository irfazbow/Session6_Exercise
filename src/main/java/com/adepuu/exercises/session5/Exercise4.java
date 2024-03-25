package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    static void removeDuplicate(int[] dataArray) {
        int[] dataUnique = new int[dataArray.length];
        int indexUnique = 0;

        for (int i = 0; i < dataArray.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < indexUnique; j++) {
                if (dataArray[i] == dataUnique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                dataUnique[indexUnique] = dataArray[i];
                indexUnique++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(dataUnique, indexUnique)));
    }
    public static void main(String[] args) {
        int[] inputArray = {31, 32, 31, 32, 1, 1, 2, 2, 1, 17, 16, 17};
        removeDuplicate(inputArray);
    }
}