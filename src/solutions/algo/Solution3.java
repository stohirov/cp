package solutions.algo;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        double h = scanner.nextDouble();

        System.out.printf("%.2f", (2 * s / h ));
    }
}
