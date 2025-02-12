package solutions.algo;

import java.util.Scanner;

public class Solution39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double minNumber = (num1 + num2) / 2;
        double maxNumber = num1 * 2 * num2 * 2;

        num1 = num2 > num1 ? minNumber : maxNumber;
        num2 = num2 < num1 ? minNumber : maxNumber;

        System.out.printf("%.1f ", num1);
        System.out.printf("%.1f ", num2);

    }
}
