package HashSet;

import java.util.*;

public class HashsetBasics {

    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        // - maximum properties are same ans hashmaps
        st.add("a");
        st.add("b");
        st.add("c");
        st.add("d");
        st.add("a");
        System.out.println(st); // [a, b, c, d]
        System.out.println(st.contains("a")); // true
        for (String s : st) {
            System.out.print(s + " ");
        }
    }
}
