package solutions.yandex;

import java.util.*;

public class AlternativeHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }

        Set<Integer> setA = new HashSet<>();
        for (int a : A) {
            setA.add(a);
        }

        Set<Integer> setB = new HashSet<>();
        for (int b : B) {
            setB.add(b);
        }

        Set<Integer> setC = new HashSet<>();
        for (int c : C) {
            setC.add(c);
        }

        setA.retainAll(setB);
        setA.retainAll(setC);

        int deletions = 0;
        for (int i = 0; i < N; i++) {
            if (!setA.contains(A[i]) || !setA.contains(B[i]) || !setA.contains(C[i])) {
                deletions++;
            }
        }

        System.out.println(deletions);
    }
}