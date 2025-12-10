package Array.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListQuestions {

    static void reverseArrayList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);

        System.out.println("Original Array List: " + list1);
        // reverseArrayList(list1);
        Collections.reverse(list1);
        System.out.println("Reversed Array List: " + list1);
        Collections.sort(list1);
        System.out.println("Ascending Array List: " + list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Decending Array List: " + list1);
    }
}
