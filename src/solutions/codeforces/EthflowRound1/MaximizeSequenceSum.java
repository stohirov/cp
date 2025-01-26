package solutions.codeforces.EthflowRound1;

import java.util.*;

public class MaximizeSequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            System.out.println(maximizeSum(a));
        }

        scanner.close();
    }

    private static int maximizeSum(int[] a) {
        int n = a.length;

        int maxSum = Arrays.stream(a).sum();

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(a);
        visited.add(Arrays.toString(a));

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            maxSum = Math.max(maxSum, Arrays.stream(current).sum());

            int[] reversed = reverseArray(current);
            if (visited.add(Arrays.toString(reversed))) {
                queue.add(reversed);
            }

            if (current.length > 1) {
                int[] diff = differenceSequence(current);
                if (visited.add(Arrays.toString(diff))) {
                    queue.add(diff);
                }
            }
        }

        return maxSum;
    }

    private static int[] reverseArray(int[] a) {
        int n = a.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = a[n - i - 1];
        }
        return reversed;
    }

    private static int[] differenceSequence(int[] a) {
        int n = a.length;
        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = a[i + 1] - a[i];
        }
        return diff;
    }
}