package Strings;

public class StringAndStringBuilder {

    public static void main(String[] args) {

        // String creation using string literal
        String s1 = "Java";
        String s2 = "Java";

        // Both s1 and s2 point to the same object in string constant pool
        System.out.println(s1 == s2);

        // String creation using new keyword
        String s3 = new String("Java");

        // s3 is a different object stored in heap memory
        System.out.println(s1 == s3);

        // Content comparison using equals
        System.out.println(s1.equals(s3));

        // String immutability example
        String name = "Ayush";
        name.concat(" Karma");

        // Original string is not changed
        System.out.println(name);

        // Assigning creates a new string object
        name = name.concat(" Karma");
        System.out.println(name);

        // Length of string
        String text = "Programming";
        System.out.println(text.length());

        // Character at index
        System.out.println(text.charAt(3));

        // Substring
        System.out.println(text.substring(0, 6));

        // Check presence of substring
        System.out.println(text.contains("gram"));

        // Index operations
        System.out.println(text.indexOf('m'));
        System.out.println(text.lastIndexOf('m'));

        // Case conversion
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        // Start and end checks
        System.out.println(text.startsWith("Pro"));
        System.out.println(text.endsWith("ing"));

        // Replace characters and strings
        String replaced = text.replace("ming", "mer");
        System.out.println(replaced);

        // Trim spaces
        String spaced = "   Hello Java   ";
        System.out.println(spaced.trim());

        // Split string
        String sentence = "Java is object oriented";
        String[] parts = sentence.split(" ");

        for (String part : parts) {
            System.out.println(part);
        }

        // Converting other data types to String
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println(numStr);

        // StringBuilder creation
        StringBuilder sb = new StringBuilder("Hello");

        // StringBuilder is mutable
        sb.append(" World");
        System.out.println(sb);

        // Insert at index
        sb.insert(5, ",");
        System.out.println(sb);

        // Replace part of string
        sb.replace(0, 5, "Hi");
        System.out.println(sb);

        // Delete characters
        sb.delete(2, 3);
        System.out.println(sb);

        // Reverse string
        sb.reverse();
        System.out.println(sb);

        // Length and capacity
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        // Ensure minimum capacity
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        // String concatenation creates new objects
        String a = "A";
        a = a + "B";
        a = a + "C";
        System.out.println(a);

        // StringBuilder modifies same object
        StringBuilder sb2 = new StringBuilder("A");
        sb2.append("B");
        sb2.append("C");
        System.out.println(sb2);

        // Convert StringBuilder to String
        String finalResult = sb2.toString();
        System.out.println(finalResult);

        // Performance note
        // String is better for fixed values
        // StringBuilder is better when data changes frequently
    }
}
