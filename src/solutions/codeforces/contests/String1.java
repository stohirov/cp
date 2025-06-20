package solutions.codeforces.contests;

import java.util.Scanner;

public class String1 {
    public static void main(java.lang.String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        scanner.nextLine();

        java.lang.String[] strings = new java.lang.String[numberOfTests];
        int testNum = 0;

        while (numberOfTests != 0) {
            strings[testNum] = scanner.nextLine();
            numberOfTests--;
            testNum++;
        }

        int count = 0;

        for (java.lang.String string : strings) {

            if (!string.contains("1")) {
                System.out.println(0);
                continue;
            }

            char[] chars = string.toCharArray();

            for (char aChar : chars) {
                if (aChar == '1') count++;
            }

            System.out.println(count);
            count = 0;
        }

    }
}
