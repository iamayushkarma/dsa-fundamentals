package Hashmap;

import java.util.*;

public class HashmapQuestions {

    // > Q1
    // Given an array, find the most frequent element in it. If there are multiple
    // elements that appear a maximum number of times, print any one of them.
    static void findMaxFreq(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int el : arr) {
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }
        int maxFreq = -1, ansKey = -1;
        for (var e : map.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey + ": " + maxFreq);
    }

    public static void main(String[] args) {

        // > Q1
        int[] arr1 = { 4, 2, 7, 2, 4, 5, 2, 7, 4, 7, 7, 3, 2, 4, 7, 6 };
        findMaxFreq(arr1);
    }
}
