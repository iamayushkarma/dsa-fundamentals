package HashSet;

import java.util.*;

public class HashsetQuestions {

    // > Q1
    // Given an unsorted array of integers nums, return the length of the longest
    // consecutive elements sequence.

    static int longestConsecutiveSequence(int[] arr) {
        int maxStreak = 0;
        HashSet<Integer> st = new HashSet<>();
        for (var el : arr)
            st.add(el);
        for (var nums : st) {
            if (!st.contains(nums - 1)) {
                int currNum = nums;
                int currStreak = 1;

                while (st.contains(currNum + 1)) {
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {

        // > Q1
        int[] arr = { 100, 4, 500, 1, 3, 2 };
        System.out.println(longestConsecutiveSequence(arr));
    }
}
