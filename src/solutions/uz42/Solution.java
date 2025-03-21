package solutions.uz42;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        String[] arr = new String[]{"H","a","n","n","a","h"};
        System.out.println(Arrays.toString(reverseString(arr)));
    }

    public static String[] reverseString(String[] s) {
        int right = s.length - 1;
        int left = 0;
        while (left < right) {
            String temp = s[right];
            s[right] = s[left];
            s[left] = temp;

            left++;
            right--;
        }

        return s;
    }
}