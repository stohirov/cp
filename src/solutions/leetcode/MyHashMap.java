package solutions.leetcode;

public class MyHashMap {

    private Node[] hashMap;

    public MyHashMap() {
        hashMap = new Node[1000];
        for (int i = 0; i < 1000; i++) {
            hashMap[i] = new Node(-1, -1);
        }
    }

    public void put(int key, int value) {
        int hash = hash(key);
        Node curr = hashMap[hash];

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next.value = value;
                return;
            }
            curr = curr.next;
        }
        curr.next = new Node(key, value);
    }

    public int get(int key) {
        int hash = hash(key);
        Node curr = hashMap[hash];

        while (curr != null) {
            if (curr.key == key)
                return curr.value;
            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {
        int hash = hash(key);
        Node curr = hashMap[hash];

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }

    private int hash(int key) {
        return key % 1000;
    }
}
