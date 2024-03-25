package com.adepuu.exercises.session5;

import java.util.Arrays;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    static void isAnagram (String s, String t) {
        s = s.replaceAll("\\s","");
        t = t.replaceAll("\\s","");
        s = s.toLowerCase();
        t = t.toLowerCase();
        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < s.length(); i++) {
            if (sArray[i] != tArray[i]) {
            System.out.println(false);
            return;
            }
        }
        System.out.println(true);
    }
    public static void main(String[] args) {
        String s = "Listen";
        String t = "Silent";
        isAnagram(s, t);
    }
}