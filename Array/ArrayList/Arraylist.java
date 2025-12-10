package Array.ArrayList;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {
        //> Wrapper class
        // Integer in = Integer.valueOf(7);
        // System.out.print(in);

        // ArrayList < Type of object > name = new ArrayList< Integer (passing same type of object is optional)>();
        ArrayList<Integer> l1 = new ArrayList<>();

        // if we did not specify the type of object we can add anything, it will be a raw type
        ArrayList l2 = new ArrayList<>();
        l2.add(true);
        l2.add(7);
        l2.add("Vamos!!");
        l2.add(0);

        System.out.println(l2);

        // adding an element
        l1.add(1);
        l1.add(2);
        l1.add(3);

        // get and element at an index
        System.out.println(l1.get(0)); // .get(index)

        // print via for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i)); // 1 2 3
        }

        // Array list can be print directly
        System.out.println(l1); // [1, 2, 3]

        // adding element at some index
        l1.add(1, 7); // .add(index, value)
        System.out.println(l1);

        // modifying element at index i
        l1.set(2, 10); // .set(index, value) changes previous value at that index to the new value
        System.out.println(l1);

        // removing an value at any index
        l1.remove(0); // value at that index will be removed
        System.out.println(l1);

        // removing and element by its value
        l1.remove(Integer.valueOf(3)); // Integer.valueOf(value to be remove)
        System.out.println(l1);
        System.out.println(l1.remove(Integer.valueOf(3))); // will return true is the vale successfully removed and false if value not found

        // checking if an element exist
        System.out.println(l1.contains(Integer.valueOf(7))); // true in our case
    }
}
