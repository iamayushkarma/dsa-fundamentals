package fundamentals;

public class BasicPatterns {
    public static void main(String args[]){
    
    //> Q. 1
    // *****
    // *****
    // *****
    // *****

        // int n = 4;
        // int m = 5;
        // // outer loop
        // for(int i = 1; i<=n; i++){
        //     // inner loop
        //     for(int j = 1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
    //> Q. 2
    // *****
    // *   *
    // *   *
    // *****

        // int n = 4;
        // int m = 5;

        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=m; j++){
        //         // cell -> (i,j)
        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("*");
        //         }else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


    //> Q. 3
    // *
    // **
    // ***
    // ****

        // int n = 4;
        // for(int i = 1; i<=n; i++){
        //     // inner loop
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


    // //> Q. 4
    // // ****
    // // ***
    // // **
    // // *

    //     int n = 4;
    //     for(int i = n; i>=1; i--){
    //         // inner loop
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }


    //> Q. 5
    //    *
    //   **
    //  ***
    // ****

        // int n = 4;
        // // outer loop
        // for(int i = 1; i<=n; i++){
        //     // inner loop to print spaces
        //     for(int j = 1; j<= n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // inner loop to print star
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

    //> Q. 6
    // 1
    // 12
    // 123
    // 1234
    // 12345

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    //> Q. 7
    // 12345
    // 1234
    // 123
    // 12
    // 1

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    
    //> Q. 8 Floyd's Triangle
    // 1 
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

        // int n = 5;
        // int num = 1;

        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }

    //> Q. 9
    // 1 
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

        // int n = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         int sum = i + j;
        //         if(sum % 2 == 0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
