package fundamentals;

import java.util.*;

public class ConditionalStatements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        if(numberOne == numberTwo){
            System.out.println("Numbers are equal");
        }else if(numberOne > numberTwo)
            System.out.println("numberOne is grater"); // No need for {} braces when there's only one statement in if/else/loop
        else {
            System.out.println("numberTwo is grater");
        }

        switch ()
    }
}
