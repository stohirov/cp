package solutions.yandex;

import java.util.Scanner;

public class BracketSequence {
    static final int MOD = 1000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine().trim();

        int[][] dp = new int[N + 1][N + 1];
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N; j++) {
                if (dp[i][j] == 0) continue;

                char c = s.charAt(i);
                if (c == '(' || c == '?') {

                    if (j + 1 <= N) {
                        dp[i + 1][j + 1] = (dp[i + 1][j + 1] + dp[i][j]) % MOD;
                    }
                }
                if (c == ')' || c == '?') {
                    if (j - 1 >= 0) {
                        dp[i + 1][j - 1] = (dp[i + 1][j - 1] + dp[i][j]) % MOD;
                    }
                }
            }
        }

        System.out.println(dp[N][0]);
    }
}