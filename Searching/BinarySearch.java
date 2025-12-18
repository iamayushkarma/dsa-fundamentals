package Searching;

public class BinarySearch {

    static boolean binarySearch(int[] arr, int target) {

        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return true;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return false;
    }

    static boolean binarySearchViaRecursion(int[] arr, int target, int start, int end) {

        if (start > end)
            return false;
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return true;
        if (arr[mid] > target) {
            return binarySearchViaRecursion(arr, target, start, mid - 1);
        }
        if (arr[mid] < target) {
            return binarySearchViaRecursion(arr, target, mid + 1, end);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 12, 23, 35, 48, 61, 74, 85, 97 };
        int target = 74;
        System.out.println();
        System.out.println(binarySearch(arr, target));
        System.out.print("Binary search via recursion:");
        System.out.println();
        System.out.println(binarySearchViaRecursion(arr, target, 0, arr.length - 1));

    }

}
