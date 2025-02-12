package solutions.algo;

import java.util.Map;
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.printf("%.2f", (Math.PI * r * r * h / 3));
    }
}
