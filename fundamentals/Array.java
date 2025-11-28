package fundamentals;
import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];

        // for(int i = 0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }
        // int x = sc.nextInt();

        // for(int i = 0; i<numbers.length; i++){
        //     if(numbers[i] == x){
        //         System.out.println("x found at index: " + i);
        //     }
        // }

        //> Printing 2D array
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];
        //> Input
        // rows
        for(int i = 0; i < rows; i++){
            // colunms
            for(int j = 0; j < cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        //> Output
        int x = sc.nextInt();
        // rows
        for(int i = 0; i < rows; i++){
            // colunms
            for(int j = 0; j < cols; j++){
                if(numbers[i][j] == x){
                    System.out.print("Index for your number " + x + " is (" + i + ", " + j + ") ");
                }
            }
            System.out.println();
        }


    } // end of main function
}
