package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuestions {

    static Scanner sc = new Scanner(System.in);

    //> Helper function
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int totalSum(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    //> Q 1 Find the total number of pairs in the Array whose sun is equal to the give vlaue x
    public static void findSum(int arr[], int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    //> Q 2 Count the numbers of triplets whose sum is equal to the given value x
    public static void countTriplet(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int triplets = arr[i] + arr[j] + arr[k];
                    if (triplets == x) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total triplets are: " + count);
    }

    //> Q 3 Find the unique element
    static int findUniqueElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    //> Q 4 Find second max number
    public static int findMax(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }

    static int findSecondMax(int[] arr) {
        int maxNum = findMax(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxNum) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }

    //> Q 5 Find the first repeating value

    static int findRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    //> Q 6 Reverse an array
    static int[] reverseArr(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    //> Q 7 Reverse an array inplace
    static int[] reverseArrInPlace(int arr[]) {
        int n = arr.length;
        int i = 0, j = n - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return arr;
    }

    //> Q 8 Rotate and array of length n till k times

    static int[] rotateArr(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }

        return ans;
    }

    //> Q 9

    static int[] freqArr(int arr[]) {
        int fqArr[] = new int[1000005];
        for (int i = 0; i < arr.length; i++) {
            fqArr[arr[i]]++;
        }
        return fqArr;
    }

    //> Q 10 Prefix sum
    static int[] prefixSum(int arr[]) {
        int n = arr.length;
        // creating an new array
        int[] prefixAns = new int[n];
        prefixAns[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixAns[i] = prefixAns[i - 1] + arr[i];
        }
        return prefixAns;
        // Without creating any new array
        // for(int i = 1; i < n; i++){
        //     arr[i] += arr[i-1];
        // }
        // return arr;
    }

    //> Q 11 Prefix sun for range l to r with one based indexing
    static int[] prefixSumOneBased(int arr[]) {
        int n = arr.length;
        int[] prefixAns = new int[n + 1];
        prefixAns[0] = 0;

        for (int i = 1; i <= n; i++) {
            prefixAns[i] = prefixAns[i - 1] + arr[i - 1];
        }
        return prefixAns;
    }

    //> Q 12 Check if we can partition the array into two subarrays with equal sum. More
    //>formally, check that the prefix sum of a part of the array is equal to the suffix
    //>sum of rest of the array.

    static boolean staticSumPartition(int arr[]) {
        int totalSum = totalSum(arr);
        int prefix = 0;

        for (int i = 0; i < arr.length; i++) {
            prefix += arr[1];
            int suffixSum = totalSum - prefix;

            if (suffixSum == prefix) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //> Q1
        // int arr_Q1[] = {4,6,3,5,8,2};
        // int target = 7;
        // findSum(arr_Q1, target);

        //> Q2
        // int arr_Q2[] = {1,4,5,6,3};
        // int target2 = 12;
        // countTriplet(arr_Q2, target2);

        //> Q3
        // int arr_Q3[] = {1,2,2,1,3};
        // System.out.println(findUniqueElement(arr_Q3));

        //> Q4
        // int arr_Q4[] = {5,8,12,11,6,1};
        // System.out.println("Second maximun number is: " + findSecondMax(arr_Q4));

        //> Q5
        // int arr_Q5[] = {5,8,11,11,6,5};
        // System.out.println(findRepeating(arr_Q5));

        //> Q6
        // int arr_Q6[] = {1,2,3,4,5,6};
        // int ans[] = reverseArr(arr_Q6);
        // printArr(ans);

        //> Q7
        // int arr_Q7[] = {1,2,3,4,5};
        // int ans[] = reverseArrInPlace(arr_Q7);
        // printArr(ans);

        //> Q8
        // int arr_Q8[] = {1,2,3,4,5};
        // int k = 2;
        // int ans[] = rotateArr(arr_Q8, k);
        // printArr(ans);

        //> Q9

        // int arr_Q9[] = {10, 51, 2, 78, 66, 3, 4};
        // int[] freq = freqArr(arr_Q9);
        // System.out.print("Enter number to querys: ");
        // int q = sc.nextInt();

        // while(q > 0){
        //     System.out.print("Enter number to searched: ");
        //     int x = sc.nextInt();
        //     if(freq[x] > 0){
        //         System.out.println("Yes");
        //     }else{
        //         System.out.println("No");
        //     }
        //     q--;
        // }

        //> Q 10
        // int arr_Q10[] = {1, 3, 4, 6, 7};
        // int[] prefix = prefixSum(arr_Q10);
        // printArr(prefix);

        //> Q 11

        // int arr_Q11[] = {1,2,3,4,5,6};
        // int[] prefix = prefixSumOneBased(arr_Q11);
        // System.out.print("Enter number to querys: ");
        // int q = sc.nextInt();

        // while(q-- > 0){
        //     System.out.println("Enter the range");
        //     int l = sc.nextInt();
        //     int r = sc.nextInt();

        //     int ans = prefix[r] - prefix[l-1];

        //     System.out.println("Ans: " + ans);
        // }

        //> Q 12
        int[] arr_Q12 = { 1, 2, 3, 6 };
        System.out.println("Equal partition possible: " + staticSumPartition(arr_Q12));
    }
}
