package solutions.algo;

import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = scanner.nextInt();
        int s = scanner.nextInt();
        double t = (double) s / v;
        System.out.printf("%.2f", t);
    }
}
