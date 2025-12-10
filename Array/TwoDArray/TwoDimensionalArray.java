package Array.TwoDArray;

public class TwoDimensionalArray {

    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 5, 6 }, { 2, 9, 7 }, { 4, 8, 6 } };
        print2DArray(arr);
    }
}
