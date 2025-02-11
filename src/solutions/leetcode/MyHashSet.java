package solutions.leetcode;

import java.util.HashMap;

// Solution 705
public class MyHashSet {

    private static final Object PRESENT = new Object();
    private HashMap<Integer, Object> map;

    public MyHashSet() {
        map = new HashMap<>();
    }

    public void add(int key) {
        map.put(key, PRESENT);
    }

    public void remove(int key) {
        map.remove(key);
    }

    public boolean contains(int key) {
        return map.get(key) == PRESENT;
    }
}
