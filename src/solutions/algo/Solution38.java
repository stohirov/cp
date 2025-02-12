package solutions.algo;

import java.util.Scanner;

public class Solution38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[3];

        numbers[0] = scanner.nextDouble();
        numbers[1] = scanner.nextDouble();
        numbers[2] = scanner.nextDouble();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 1 && numbers[i] <= 3) System.out.print(numbers[i]);
            if (i != numbers.length - 1) System.out.print(" ");
        }
    }
}
