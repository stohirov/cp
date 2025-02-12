package solutions.algo;

import java.util.Scanner;

public class Solution40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[3];

        for (int i = 0; i < ints.length; i++) {
            int input = scanner.nextInt();
            ints[i] = input > 0 ? (int) Math.pow(input, 2) : input;
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i != ints.length - 1) System.out.print(" ");
        }
    }
}
