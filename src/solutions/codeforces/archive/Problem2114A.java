package solutions.codeforces.archive;

import java.util.Scanner;

public class Problem2114A {
    public static void solve(String s) {
        long n = Long.parseLong(s);
        long root = (long) Math.sqrt(n);
        if (root * root != n) {
            System.out.println("-1");
            return;
        }

        for (int i = 1; i < s.length(); i++) {
            long a = Long.parseLong(s.substring(0, i));
            long b = Long.parseLong(s.substring(i));
            if (a + b == root) {
                System.out.println(a + " " + b);
                return;
            }
        }

        // Если не нашли
        System.out.println("-1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            solve(s);
        }
    }
}
