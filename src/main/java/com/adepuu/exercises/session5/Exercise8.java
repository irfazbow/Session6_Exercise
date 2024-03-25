package com.adepuu.exercises.session5;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
    public static void findDuplicate(int[] dataInput) {
        List<Integer> dataDuplicate = new ArrayList<>();
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (int num : dataInput) {
            if (numberMap.containsKey(num)) {
                numberMap.put(num, numberMap.get(num) + 1);
            } else {
                numberMap.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
                dataDuplicate.add(key);
            }
        }
        System.out.println("The duplicate data is: " + dataDuplicate);
    }

    public static void main(String[] args) {
        int[] dataInput = {1, 1, 2, 3, 4, 55, 6, 55, 8, 1, 5, 8};
        findDuplicate(dataInput);
    }
}
