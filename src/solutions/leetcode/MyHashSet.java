package solutions.leetcode;

import java.util.HashMap;

// Solution 705
public class MyHashSet {

    int[] numbers;

    public MyHashSet() {
        numbers = new int[31251];
    }

    public void add(int key) {
        numbers[getIdX(key)] |= getMask(key);
    }

    private int getIdX(int key) {
        return (key / 32);
    }

    private int getMask(int key) {
        key %= 32;
        return (1 << key);
    }

    public void remove(int key) {
        numbers[getIdX(key)] &= (~getMask(key));
    }

    public boolean contains(int key) {
        return (numbers[getIdX(key)] & getMask(key)) != 0;
    }
}
