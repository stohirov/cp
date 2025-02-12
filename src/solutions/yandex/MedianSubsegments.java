package solutions.yandex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MedianSubsegments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        int posB = -1;
        for (int i = 0; i < N; i++) {
            if (A[i] == B) {
                posB = i;
                break;
            }
        }

        int[] prefix = new int[N + 1];
        int balance = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] < B) balance++;
            else if (A[i] > B) balance--;
            prefix[i + 1] = balance;
        }

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i <= posB; i++) {
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }

        for (int i = posB + 1; i <= N; i++) {
            result += map.getOrDefault(prefix[i], 0);
        }

        System.out.println(result);
    }
}
