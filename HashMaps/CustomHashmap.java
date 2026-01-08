package HashMaps;

import java.util.LinkedList;

public class CustomHashmap {
    // Implement your own HashMap with the following methods.
    // > 1 .put(key,value)
    // ~ Returns void
    // ~ Inserts/Updates
    // > 2 get(key)
    // ~ Returns value corresponding to key if it exists
    // ~ Returns null if key doesn't exist size
    // ~ Returns the number of entries in HashMap
    // > 3 remove(key)
    // Removes an entry with key 'key' from the HashMap
    // ~ Returns null or value
    // Both keys and values can be of any type. I

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of entries in map
        private LinkedList<Node>[] buckets;

        public int size() { // return the number of entries in map
            return n;
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private void initBuckets(int N) {// N capacity / size of buckets array
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        // itrate to the linked list looks for a node with key if found return its idx,
        // if not found returns null
        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void reHash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public int capacity() {
            return buckets.length;
        }

        // constructor
        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public void put(K key, V value) { // insert and update
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);
            if (ei == -1) { // key does not exist
                Node node = new Node(key, value);
                currentBucket.add(node);
                n++;
            } else { // update
                Node currNode = currentBucket.get(ei);
                currNode.value = value;
            }

            // rehashing
            if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
                reHash();
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);
            if (ei != -1) { // key does not exist
                Node currNode = currentBucket.get(ei);
                return currNode.value;

            }
            return null;
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket, key);
            if (ei != -1) { // key does not exist
                Node currNode = currentBucket.get(ei);
                V val = currNode.value;
                currentBucket.remove(ei);
                n--;
                return val;

            }
            return null;
        }
    }

    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map = new MyHashMap<>();
        map.put(5, 2);
        map.put(6, 10);
        map.put(8, 61);
        map.put(4, 1);
        map.put(4, 21);
        System.out.println(map.size()); // 4

        System.out.println(map.get(4)); // 21

        map.remove(8);
        System.out.println(map.get(8)); // null
        map.put(7, 210);
        System.out.println(map.size()); // 4

        System.out.println("Current capacity" + map.capacity());// 8
    }
}
