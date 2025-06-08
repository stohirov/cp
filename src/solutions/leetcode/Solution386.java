package solutions.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(n, i, result);
        }
        return result;
    }

    public void dfs(int n, int current, List<Integer> result) {
        if (current > n) return;
        result.add(current);
        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;
            if (next > n) break;
            dfs(n, next, result);
        }
    }
}
