package solutions.yandex;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Crossword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < C; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        Set<String> words = new TreeSet<>();

        for (int i = 0; i < R; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < C; j++) {
                if (grid[i][j] != '#') {
                    word.append(grid[i][j]);
                } else {
                    if (word.length() >= 2) {
                        words.add(word.toString());
                    }
                    word = new StringBuilder();
                }
            }
            if (word.length() >= 2) {
                words.add(word.toString());
            }
        }

        for (int j = 0; j < C; j++) {
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < R; i++) {
                if (grid[i][j] != '#') {
                    word.append(grid[i][j]);
                } else {
                    if (word.length() >= 2) {
                        words.add(word.toString());
                    }
                    word = new StringBuilder();
                }
            }
            if (word.length() >= 2) {
                words.add(word.toString());
            }
        }

        String smallestWord = words.iterator().next();
        System.out.println(smallestWord);
    }
}
