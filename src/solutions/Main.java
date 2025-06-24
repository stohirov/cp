package solutions;

import solutions.codingbat.String2;
import solutions.leetcode.MyHashMap;
import solutions.leetcode.Solution171;
import solutions.leetcode.Solution326;
import solutions.leetcode.Solution3442;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(4, 5);
        map.put(4, 8);

        System.out.println(map.get(4));
    }
}