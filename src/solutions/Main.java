package solutions;

import solutions.codingbat.String2;
import solutions.leetcode.Solution171;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String title = new Scanner(System.in).nextLine();
        System.out.println(Solution171.titleToNumber(title));
    }
}