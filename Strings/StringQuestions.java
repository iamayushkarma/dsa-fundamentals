package Strings;

public class StringQuestions {

    public static void main(String[] args) {

        // Q1
        // What is a String in Java?
        // A String is a sequence of characters and is an object of String class.

        String q1 = "Hello";
        System.out.println(q1);

        // Q2
        // Are Strings mutable or immutable?
        // Strings are immutable.

        String q2 = "Java";
        q2.concat(" Language");
        System.out.println(q2);

        // Q3
        // How do you create a String using literal?
        String q3 = "Programming";
        System.out.println(q3);

        // Q4
        // How do you create a String using new keyword?
        String q4 = new String("Programming");
        System.out.println(q4);

        // Q5
        // What is String Constant Pool?
        // It stores string literals to reduce memory usage.

        String q5a = "Pool";
        String q5b = "Pool";
        System.out.println(q5a == q5b);

        // Q6
        // Difference between == and equals() method

        String q6a = new String("Test");
        String q6b = new String("Test");
        System.out.println(q6a == q6b);
        System.out.println(q6a.equals(q6b));

        // Q7
        // How to find length of a String?
        String q7 = "Length";
        System.out.println(q7.length());

        // Q8
        // How to get character at a specific index?
        String q8 = "Index";
        System.out.println(q8.charAt(2));

        // Q9
        // How to extract a substring?
        String q9 = "Substring";
        System.out.println(q9.substring(0, 3));

        // Q10
        // How to check if a String contains another String?
        String q10 = "Programming";
        System.out.println(q10.contains("gram"));

        // Q11
        // How to convert String to upper and lower case?
        String q11 = "Java";
        System.out.println(q11.toUpperCase());
        System.out.println(q11.toLowerCase());

        // Q12
        // How to remove extra spaces from a String?
        String q12 = "   Java   ";
        System.out.println(q12.trim());

        // Q13
        // How to split a String?
        String q13 = "Java is powerful";
        String[] parts = q13.split(" ");

        for (String part : parts) {
            System.out.println(part);
        }

        // Q14
        // How to replace characters or words in a String?
        String q14 = "I like Java";
        System.out.println(q14.replace("Java", "Programming"));

        // Q15
        // How to compare two Strings ignoring case?
        String q15a = "HELLO";
        String q15b = "hello";
        System.out.println(q15a.equalsIgnoreCase(q15b));

        // Q16
        // How many objects are created in this statement?
        // String s = new String("Hello");

        String q16 = new String("Hello");
        System.out.println(q16);

        // Answer:
        // Two objects are created

        // Q17
        // Reverse a String using StringBuilder
        String q17 = "ABCDE";
        String reversed = new StringBuilder(q17).reverse().toString();
        System.out.println(reversed);

        // Q18
        // Difference between String and StringBuilder performance

        String s = "A";
        s = s + "B";
        s = s + "C";
        System.out.println(s);

        StringBuilder sb = new StringBuilder("A");
        sb.append("B");
        sb.append("C");
        System.out.println(sb);

        // Q19
        // Convert primitive data type to String
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println(numStr);
    }
}
