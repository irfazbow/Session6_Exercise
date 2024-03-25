package com.adepuu.exercises.session5;

public class Exercise1 {
    static void findMax(int[] dataArray) {
        int dataMax = dataArray[0];
        for (int i : dataArray) {
            if (i > dataMax) {
                dataMax = i;
            }
        }
        System.out.println("The largest number from the data is: " + dataMax);
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 21, 4, 9, 5, 10, 11, 1, 5, 4, 7};
        findMax(inputArray);
    }
}
