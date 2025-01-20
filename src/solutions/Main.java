package solutions;

import solutions.codewars.Kata;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Kata kata = new Kata();
        System.out.println(Arrays.toString(Kata.productArray(new int[]{12, 20})));
    }
}
