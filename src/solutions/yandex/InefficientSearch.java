package solutions.yandex;

import java.util.Scanner;

public class InefficientSearch {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }

    static TrieNode root = new TrieNode();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = scanner.nextLine().trim().toUpperCase();
            insert(words[i]);
        }

        int Q = scanner.nextInt();
        scanner.nextLine();

        String[] queries = new String[Q];
        for (int i = 0; i < Q; i++) {
            queries[i] = scanner.nextLine().trim().toUpperCase();
        }

        for (String query : queries) {
            int actions = 0;
            boolean found = false;

            for (String word : words) {
                int lcpLength = findLCP(query, word);
                actions += 1 + lcpLength;

                if (lcpLength == query.length() && query.length() == word.length()) {
                    found = true;
                    break;
                }
            }

            System.out.println(actions);
        }
    }

    private static void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            int index = c - 'A';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    private static int findLCP(String query, String word) {
        int lcpLength = 0;
        int minLength = Math.min(query.length(), word.length());

        while (lcpLength < minLength && query.charAt(lcpLength) == word.charAt(lcpLength)) {
            lcpLength++;
        }

        return lcpLength;
    }
}