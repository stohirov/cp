package solutions.codeforces.EthflowRound1;

import java.util.*;

public class Main {
    public static void main(String1[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of clocks
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            if (canRotateIndefinitely(a)) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }

        System.out.print(result);
        scanner.close();
    }

    private static boolean canRotateIndefinitely(int[] a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;

        for (int time : a) {
            pq.offer(time);
            sum += time;
        }

        while (!pq.isEmpty()) {
            int max = pq.poll();
            sum -= max;

            if (max > sum) {
                return false;
            }

            pq.offer(max - 1);
            sum += (max - 1);

            if (max - 1 == 0) {
                break;
            }
        }

        return true;
    }
}
