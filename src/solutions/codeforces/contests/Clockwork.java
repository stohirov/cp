package solutions.codeforces.contests;

import java.util.*;

public class Clockwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of clocks
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            if (isIndefinitelyPossible(a)) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }

        System.out.print(result);
        scanner.close();
    }

    private static boolean isIndefinitelyPossible(int[] a) {
        int max1 = 0, max2 = 0;

        for (int time : a) {
            if (time > max1) {
                max2 = max1;
                max1 = time;
            } else if (time > max2) {
                max2 = time;
            }
        }

        return max1 <= Arrays.stream(a).sum() - max1;
    }
}
