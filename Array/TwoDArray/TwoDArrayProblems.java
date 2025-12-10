package Array.TwoDArray;

import java.util.Scanner;

public class TwoDArrayProblems {

    //> Helper Funcrion
    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swapTwoValues(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            swapTwoValues(arr, i, n - i - 1);
        }
    }

    //> Q1 Additioņ of two matrix
    static void addMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong inputs, please check the matrix");
            return;
        }

        int[][] sum = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum ot matrix is");
        print2DArray(sum);
    }

    //> Q2 Multiplication of two matrix
    static void multiplyMatrix(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong inputs, please check the matrix");
            return;
        }
        int[][] multiply = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    multiply[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Answer for multiplication is");
        print2DArray(multiply);
    }

    //> Q3 Transpose Matrix
    static int[][] FindTransposeMatrix(int[][] a, int r, int c) {
        int[][] transpose = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = a[j][i];
            }
        }
        return transpose;
    }

    //> Q4 Transpose Matrix in place
    static void FindTransposeMatrixInPlace(int[][] a, int r, int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }

    //> Q5 Rotote an square matrix 90 degree

    static void rotate2DArray(int[][] arr, int n) {
        FindTransposeMatrixInPlace(arr, n, n);

        for (int i = 0; i < n; i++) {
            reverseArray(arr[i]);
        }

        print2DArray(arr);
    }

    //> Q6 Pascal's tringle
    static int[][] PascalsTriangle(int n) {
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++) {
            ans[i] = new int[i + 1]; // creating cloumns for each row
            ans[i][0] = ans[i][i] = 1; // every first and last digit is one

            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }

        return ans;
    }

    //> Q7 Print spiral matrix
    //  static void printSpiral(int[][] a, int r, int c){
    //         int topRow = 0, rightCol = c-1, bottomRow = r-1, leftCol = 0;
    //         int totalElements = 0;
    //         while (totalElements < r * c) {
    //             // topRow -> leftCol to rightCol
    //             for(int j = leftCol; j <= rightCol && totalElements < r * c;  j++){
    //                 System.out.print(a[topRow][j] + " ");
    //                 totalElements++;
    //             }
    //             topRow++;
    //             // rightCol -> topRow to bottomRow
    //             for(int i = topRow; i <= bottomRow && totalElements < r * c;  i++){
    //                 System.out.print(a[i][rightCol] + " ");
    //                 totalElements++;
    //             }
    //             rightCol--;
    //             // bottomRow -> rightCol to leftCol
    //             for(int j = rightCol; j >= leftCol && totalElements < r * c;  j--){
    //                 System.out.print(a[bottomRow][j] + " ");
    //                 totalElements++;
    //             }
    //             bottomRow--;
    //             // leftCol -> bottomRow to topRow
    //             for(int i = bottomRow; i >= topRow && totalElements < r * c;  i--){
    //                 System.out.print(a[i][leftCol] + " ");
    //                 totalElements++;
    //             }
    //             leftCol++;
    //         }
    //  }

    //> Q8 Given a positive integer n, generate an n x n matrix filled with elements from 1 to n^2 in spiral order.

    static int[][] generateSpiralMatrix(int n) {
        int martix[][] = new int[n][n];
        int topRow = 0, rightCol = n - 1, bottomRow = n - 1, leftCol = 0;
        int current = 1;
        while (current < n * n) {
            // topRow -> leftCol to rightCol
            for (int j = leftCol; j <= rightCol && current <= n * n; j++) {
                martix[topRow][j] = current++;
            }
            topRow++;
            // rightCol -> topRow to bottomRow
            for (int i = topRow; i <= bottomRow && current <= n * n; i++) {
                martix[i][rightCol] = current++;
            }
            rightCol--;
            // bottomRow -> rightCol to leftCol
            for (int j = rightCol; j >= leftCol && current <= n * n; j--) {
                martix[bottomRow][j] = current++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow
            for (int i = bottomRow; i >= topRow && current <= n * n; i--) {
                martix[i][leftCol] = current++;
            }
            leftCol++;
        }
        return martix;
    }

    //> Q9 Rectangle co-ordinates sum
    static int rectangleSum(int[][] matrix, int l1, int r1, int l2, int r2) {
        int sum = 0;

        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //> Q1
        // System.out.println("Enter number of rows and colums for matrix one");
        // int r1 = sc.nextInt();
        // int c1 = sc.nextInt();
        // System.out.println("Enter value of first matrix");
        // int[][] arr1 = new int[r1][c1];
        // for(int i = 0; i < r1; i++){
        //     for(int j = 0; j < c1; j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }

        // System.out.println("Enter number of rows and colums for matrix second");
        // int r2 = sc.nextInt();
        // int c2 = sc.nextInt();
        // System.out.println("Enter value of Second matrix");
        // int[][] arr2 = new int[r2][c2];
        // for(int i = 0; i < r2; i++){
        //     for(int j = 0; j < c2; j++){
        //         arr2[i][j] = sc.nextInt();
        //     }
        // }

        // addMatrix(arr1, r1, c1, arr2, r2, c2);
        //> Q2
        // multiplyMatrix(arr1, r1, c1, arr2, r2, c2);

        //> Q3
        // System.out.println("Enter number of rows and colums of the matrix");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Enter value of matrix");
        // int[][] arr1 = new int[r][c];
        // for(int i = 0; i < r; i++){
        //     for(int j = 0; j < c; j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Input matrix: ");
        // print2DArray(arr1);

        // System.out.println("Transpose matrix: ");
        // int ans[][] = FindTransposeMatrix(arr1, r, c);
        // print2DArray(ans);

        // //> Q4
        // System.out.println("Enter number of rows and colums of the matrix");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Enter value of matrix");
        // int[][] arr1 = new int[r][c];
        // for(int i = 0; i < r; i++){
        //     for(int j = 0; j < c; j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Input matrix: ");
        // print2DArray(arr1);

        // System.out.println("Transpose matrix: ");
        // FindTransposeMatrixInPlace(arr1, r, c);

        //> Q5
        // System.out.println("Enter number of rows and colums of the matrix");
        // int n = sc.nextInt();
        // System.out.println("Enter value of matrix");
        // int[][] arr1 = new int[n][n];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Input matrix: ");
        // print2DArray(arr1);

        // System.out.println("Transpose matrix: ");
        // rotate2DArray(arr1, n);

        //> Q6
        // System.out.println("Enter value of n");
        // int n = sc.nextInt();
        // int[][] ans = PascalsTriangle(n);
        // System.out.println("Pascal tringle for " + n + " is");
        // print2DArray(ans);

        //> Q7
        // System.out.println("Enter number of rows and colums of the matrix");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Enter value of matrix");
        // int[][] arr1 = new int[r][c];
        // for(int i = 0; i < r; i++){
        //     for(int j = 0; j < c; j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }
        // System.out.println("Input matrix: ");
        // print2DArray(arr1);

        // System.out.println("Spiral values: ");
        // printSpiral(arr1, r, c);

        //> Q8
        // System.out.print("Enter value of n: ");
        // int n = sc.nextInt();
        // System.out.println("Spiral Matrix: ");
        // int[][] ans = generateSpiralMatrix(n);
        // print2DArray(ans);

        //> Q9
        System.out.println("Enter number of rows and colums of the matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter value of matrix");
        int[][] arr1 = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value ot l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("Rectangle sum is: " + rectangleSum(arr1, l1, r1, l2, r2));
    } // End of the main function
}
