package Fundamentals;

import java.math.*;
import java.util.*;

public class FunctionsMethods {
    //> Basic Function Template
    // returnType functionName(type arg1, type arg2, ...){
    // operations
    //}

    //> Print name
    // public static void printName(String name){
    //     System.out.println(name);
    //     return;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printName(name);
    // }

    //> Multiply numbers
    // public static int multiplyNumbers(int a, int b){
    //     return a*b;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int ans = multiplyNumbers(a, b);
    //     System.out.println(ans);
    // }

    //> Factriol

    // public static void printFactorial(int n){
    //     int factorial = 1;
    //     if(n<0){
    //         System.out.println("Invalid value");
    //         return;
    //     }
    //     for(int i = n; i >= 1; i--){
    //         factorial*=i;
    //     }
    //     System.out.println(factorial);
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     printFactorial(n);
    // }

    //- Practice Questions

    //> Q. 1 Enter 3 numbers from the user & make a function to print their average.

    // public static int averageOfNumbers(int a, int b, int c){
    //     return (a + b + c)/3;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = sc.nextInt();
    //     int ans = averageOfNumbers(a, b, c);
    //     System.out.println("Average is: " + ans);
    // }

    //> Q. 2 Write a function to print the sum of all odd numbers from 1 to n.

    // public static void main(String[] args) {
    //      Scanner sc = new Scanner(System.in);
    //      int n = sc.nextInt();
    //      sullOfAllOdds(n);
    // }
    // public static void sullOfAllOdds(int n){
    //     int sum = 0;
    //     for(int i = 1; i<=n; i++){
    //         if(i % 2 != 0){
    //             sum+=i;
    //         }
    //     }
    //     System.out.print(sum);
    // }

    //> Q. 3 Write a function which takes in 2 numbers and returns the greater of those two.

    // public static void main(String[] args) {
    //      Scanner sc = new Scanner(System.in);
    //      int firstnumber = sc.nextInt();
    //      int secondnumber = sc.nextInt();

    //      System.out.println(findGrater(firstnumber, secondnumber));
    // }
    // public static int findGrater(int firstnumber,  int secondnumber) {
    //     if(firstnumber > secondnumber){
    //         return firstnumber;
    //     }else {
    //         return secondnumber;
    //     }
    // }

    //> Q. 4 Write a function that takes in the radius as input and returns the circumference of a circle.

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int radius = sc.nextInt();
    //     System.out.println("Circumference of the circle for radius " + radius + " is " + calculateRadius(radius));
    // }
    // public static double calculateRadius(double  r){
    //     return 2 * Math.PI * r;
    // }
}
