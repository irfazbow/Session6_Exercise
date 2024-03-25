package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise5 {

    static void sortArray(int[] dataArray, String sort) {
        switch (sort) {
            case "asc":
                for (int i = 0; i < dataArray.length - 1; i++) {
                    for (int j = 0; j < dataArray.length - i - 1; j++) {
                        if (dataArray[j] > dataArray[j + 1]) {
                            int dataTemp = dataArray[j];
                            dataArray[j] = dataArray [j + 1];
                            dataArray[j + 1] = dataTemp;
                        }
                    }
                }
                System.out.println("Array sorted in ascending order: " + Arrays.toString(dataArray));
                break;
            case "desc":
                for (int i = 0; i < dataArray.length - 1; i++) {
                    for (int j = 0; j < dataArray.length - i - 1; j++) {
                        if (dataArray[j] < dataArray[j + 1]) {
                            int dataTemp = dataArray[j];
                            dataArray[j] = dataArray [j + 1];
                            dataArray[j + 1] = dataTemp;
                        }
                    }
                }
                System.out.println("Array sorted in descending order: " + Arrays.toString(dataArray));
                break;
            default:
                System.out.println("Please input a valid sort type, 'asc' for ascending or 'desc' for descending.");


        }

    }
    public static void main(String[] args) {
        int[] inputArray = {6, 1, 5, 2, 993, 3193, 4, 7, 3, 11, 91, 23, 55, 43, 17};
        String sortType = "asc";
        sortArray(inputArray, sortType);
    }
}
