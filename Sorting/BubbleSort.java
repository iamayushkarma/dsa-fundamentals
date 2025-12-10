package Sorting;

public class BubbleSort {
    //- Time complexity = O(n^2)
    // public static void printArray(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[] = {7,8,3,1,2};

    //     for(int i=0; i<arr.length-1; i++){
    //        for(int j = 0; j<arr.length-i-1; j++){ // "arr.length-i-i" leaving the last number beacouse the loop has ran one thime and as shifted the biggest number in the end
    //             if(arr[j] > arr[j+1]){
    //                 // swap numers
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j+1] = temp;
    //             }
    //        }
    //     }
    //     printArray(arr);
    // }

    //- Practice questions
    /*
     Q. 1 Sort in Descending Order
      Modify bubble sort to sort the array in descending order instead of ascending.
      Input: {7, 8, 3, 1, 2}
      Output: {8, 7, 3, 2, 1}
    */

    //   public static void printArray(int arr[]) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //   }
    //   public static void main(String[] args) {
    //       int arr[] = {7, 8, 3, 1, 2};
    //       int count = 0;
    //       for(int i = 0; i<arr.length-1; i++){
    //         for(int j = 0; j<arr.length-i-1; j++){
    //             // swap
    //             if(arr[j] < arr[j+1]){
    //                 int temp = arr[j+1];
    //                 arr[j+1] = arr[j];
    //                 arr[j] = temp;
    //                 count++;
    //             }
    //           }
    //        }
    //        printArray(arr);
    //        System.out.println("Total swaps taken: " + count);
    //   }

    //> Q. 2
    /*
    Sort an array of Strings
    Use bubble sort to sort an array of strings alphabetically.
    Input: {"banana", "apple", "cherry", "date"}
    Output: {"apple", "banana", "cherry", "date"}
    */
    //     public static void printArray(String arr[]) {
    //         for (int i = 0; i < arr.length; i++) {
    //             System.out.print(arr[i] + " ");
    //         }
    //       }
    //     public static void main(String[] args) {
    //         String arr[] = {"banana", "apple", "cherry", "date"};
    //         int count = 0;
    //         for (int i = 0; i < arr.length-1; i++) {
    //             for(int j = 0; j<arr.length-i-1; j++ ){
    //                 if(arr[j].compareTo(arr[j+1]) > 0){
    //                     String temp = arr[j];
    //                     arr[j] = arr[j + 1];
    //                     arr[j + 1] = temp;
    //                     count++;
    //             }
    //         }
    //     }
    //     System.out.println("Total swaps taken: " + count);
    //     printArray(arr);
    // }
}
