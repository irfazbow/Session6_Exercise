package com.adepuu.exercises.session5;

import java.util.Arrays;
import java.util.HashMap;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    static void daysToWarmer(int[] dataTemperatures) {
        int n = dataTemperatures.length;
        int[] result = new int[n];
        int maxTemp = Integer.MIN_VALUE;

        for (int tempereature : dataTemperatures) {
            maxTemp = Math.max(maxTemp, tempereature);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            int temperature = dataTemperatures[i];
            int nextWarmerDay = Integer.MAX_VALUE;

            for (int j = temperature + 1; j <= maxTemp; j++) {
                if (map.containsKey(j)) {
                    nextWarmerDay = Math.min(nextWarmerDay, map.get(j) - i);
                }
            }

            if (nextWarmerDay != Integer.MAX_VALUE) {
                result[i] = nextWarmerDay;
            }
            map.put(temperature, i);
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] dataTemperatures = {23, 25, 26, 23, 24, 24, 22, 23, 25, 31, 32, 30, 33, 19};
        daysToWarmer(dataTemperatures);

    }
}
