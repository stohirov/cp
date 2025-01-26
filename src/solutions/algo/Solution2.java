package solutions.algo;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1, r2, r3;
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        r3 = scanner.nextInt();
        System.out.printf("%.2f ", (Math.pow(r1, 2) * Math.PI));
        System.out.printf("%.2f ", (Math.pow(r2, 2) * Math.PI));
        System.out.printf("%.2f", (Math.pow(r3, 2) * Math.PI));
    }
}
