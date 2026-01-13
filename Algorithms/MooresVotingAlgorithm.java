package Algorithms;

public class MooresVotingAlgorithm {

    static int majorityElement(int[] arr) {

        int freq = 0;
        int majorityElement = -1;
        for (int val : arr) {
            if (freq == 0) {
                majorityElement = val;
                freq++;
            } else if (val != majorityElement) {
                freq--;
            } else {
                freq++;
            }
            // if (freq == 0)
            // majorityElement = val;
            // freq += (val != majorityElement) ? -1 : +1;
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr));

    }
}
