package fundamentals;
import java.util.*;

public class BitManipulation {
    public static void main(String arg[]){
        //> Get bit
        // int n = 5; // 0101
        // int pos = 3;
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0){ // doing AND operation for getting bit 
        //     System.out.println("Bit was zero");
        // }
        // else{
        //     System.out.println("Bit was one");
        // }

        //> Set bit 
        // int n = 5; // 0101
        // int pos = 1;
        // int bitMask = 1<<pos;
        // int newNumber = bitMask | n ; // doing and OR operation for setting bit
        // System.out.println(newNumber);
 
        //> Clear bit
        // in this what we do is first calculate the bit mask
        // then then calculate its NOT 
        // then perform AND with NOT (original number AND the NOT of the bit mask)

        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notOfBitMask = ~(bitMask); 
        // int finalNumber  = n & notOfBitMask; 
        // System.out.println(finalNumber);

        //> Update bit
        // in this situation if we have to update to 1 then apply Set bit operation
        // and of we want to update to 0 apply Clear bit operation

        // Scanner sc = new Scanner(System.in);
        // int operation = sc.nextInt();

        // int n = 5;
        // int pos = 1;

        // int bitMask = 1<<pos;

        // if(operation == 1){
        //     // Set bit operation
        //     int finalNumber = n | bitMask;
        //     System.out.println(finalNumber);
        // }else{
        //     // Clear bit operation
        //     int norBitMask = ~(bitMask);
        //     int finalNumber = n & norBitMask;
        //     System.out.println(finalNumber);
        // }
    }
}
