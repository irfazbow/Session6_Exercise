package com.adepuu.exercises.session5;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */

    static void isDuplicate(int[] dataArray) {
        boolean isDup = false;
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = i + 1; j < dataArray.length; j++) {
                if (dataArray[i] == dataArray[j]) {
                    isDup = true;
                    System.out.println(isDup);
                    return;
                }
            }
        }
        System.out.println(isDup);
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 11, 1};
        isDuplicate(inputArray);
    }
}
