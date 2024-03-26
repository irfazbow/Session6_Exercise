package com.adepuu.exercises.session6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

    static void inputAverage() {
        ArrayList<Float> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        float sum = 0;
        System.out.print("Input a number, or q to end the input: ");
        while (true) {
            input = scanner.next();
            try {
                float number = Float.parseFloat(input);
                numbers.add(number);
                System.out.println("Your current list of data: " + numbers);
            } catch (NumberFormatException e) {
                if (input.equalsIgnoreCase("q")) {
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    float average = sum / numbers.size();
                    System.out.println("The total value is: " + sum);
                    System.out.println("The average value is: " + average);
                    break;
                } else {
                    System.out.println("Your input is not a number or q, please input properly.");
                }
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        inputAverage();
    }
}