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

    // > Q2
    // Check whether two Strings are anagram of each other. Return true if they are
    // else return false. An anagram of a string is another string that contains the
    // same characters,only the order of characters can be different. For example,
    // "abcd" and "dabc" are an anagram of each other.

    static boolean checkForAnagram(String str1, String str2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 != l2)
            return false;
        for (int i = 0; i < l1; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            map1.put(ch1, map1.getOrDefault(ch1, 0) + 1);
            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
        }
        return map1.equals(map2);
    }

    // > Q3
    // Given two strings s and t, determine if they are isomorphic.
    // Two strings s and t are isomorphic if the characters in s can be replaced to
    // get t. All occurrences of a character must be replaced with another character
    // while preserving the order of characters. NO two characters may map to the
    // same character, but a character may map to itself.

    static boolean chackForIsomorphic(String str, String gtr) {
        if (str.length() != gtr.length())
            return false;
        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char ch2 = gtr.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) != ch2)
                    return false;
            } else if (map.containsValue(ch2)) {
                return false;
            } else {
                map.put(ch, ch2);
            }
        }
        return true;

    }

    // > Q4
    // Given an array of length n and a target, return a pair(indices) whose sum is
    // equal to the target. If there is no pair present, return -1.

    static int[] twoSum(int[] arr, int target) {
        int[] ans = { -1 };
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int partner = target - arr[i];
            if (map.containsKey(partner)) {
                ans = new int[] { i, map.get(partner) };
                return ans;
            }
            map.put(arr[i], i);
        }
        return ans;

    }

    // > Q5
    // Given an array arr[] of length N, find the length of the largest subarray
    // with sum equal to 0.
    static int findLongestZeroSumSubarrayLength(int[] arr) {
        int maxLength = 0;
        int prefixSum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (map.containsKey(prefixSum)) {
                maxLength = Math.max(i, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {

        // > Q1
        int[] arr1 = { 4, 2, 7, 2, 4, 5, 2, 7, 4, 7, 7, 3, 2, 4, 7, 6 };
        findMaxFreq(arr1);

        // > Q2
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.print("Are both string anagram: " + checkForAnagram(str1, str2));
        System.err.println();

        // > Q3
        String srt = "abcdca";
        String grt = "xyzmzx";
        System.out.print("Are both string isomorphic: " + chackForIsomorphic(srt, grt));
        System.out.println();

        // > Q4
        int[] arr4 = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println("Targer its avalable at indexes: " + Arrays.toString(twoSum(arr4, target)));

        // > Q5
        int[] arr5 = { 2, 7, 11, 15 };
        System.out.println("Largest sub sequence for zero sum is: " + findLongestZeroSumSubarrayLength(arr5));
    }
}
