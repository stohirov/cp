package solutions.leetcode;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int c: s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int c: t.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i: count) {
            if (i != 0) return false;
        }
        return true;
    }
}
