package Recursion;

public class RecursionBasics {
    static void printNumbers(int a){
        if(a == 1){
            System.out.println(a);
            return;
        }
        printNumbers(a-1);
        System.out.println(a);
    }
    
    static void printDecresing(int b){
        if(b == 1){
            System.out.println(b);
            return;
        }
        System.out.println(b);
        printDecresing(b-1);
    }

    public static void main(String[] args) {
        int a = 5;
        printNumbers(a);
        System.out.println();
        int b = 5;
        printDecresing(b);
    }
}