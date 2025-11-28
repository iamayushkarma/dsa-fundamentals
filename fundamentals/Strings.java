package fundamentals;
import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //> String Declaration
        // String name = "Messi";
        // String fullName = "Messi 10";
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is: " + name);

        //> Concatenation
        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        //> charAt
        // for(int i = 0; i < fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }

        //> Compare
        String firstName = "Tony";
        String lastName = "Tony";

        // s1 > s2: +ve value
        // s1 == s2: 0
        // s1 < s2: -ve value

        if(firstName.compareTo(lastName) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    } // end of main function
}
