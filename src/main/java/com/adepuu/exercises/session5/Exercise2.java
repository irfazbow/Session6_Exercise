package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */

    static void moveToEnd(int[] dataArray, int dataMoved) {
        if (dataArray.length < dataMoved) {
            System.out.println("You're moving more data than the available data in the array. Do a valid input, please.");
            return;
        }
        if (dataArray.length == dataMoved || dataMoved == 0) {
            System.out.println("You basically do not move anything. The data sorting is still the same.");
            return;
        }
        if (dataMoved < 0) {
            System.out.println("We don't support a negative value for the number of moved data.");
            return;
        }

        for (int i = 0; i < dataMoved; i++) {
            int dataTemp = dataArray[0];
            for (int j = 1; j < dataArray.length; j++) {
                dataArray[j-1] = dataArray[j];
            }
            dataArray[dataArray.length - 1] = dataTemp;
        }
        System.out.println("The data with moved array: " + Arrays.toString(dataArray));
    }
    public static void main(String[] args) {
        int[] inputData = {1, 2, 3, 7, 8, 9};
        int inputMove = 3;
        moveToEnd(inputData, inputMove);

    }
}
