package HashMaps;

import java.util.*;

public class HashmapBasice {

    public static void main(String[] args) {
        // Map<Key: Data-type, Value: Data-type> name = new HashMap<>();
        Map<String, Integer> hashmap = new HashMap<>();

        // one key and value pair is called entry
        // - .put()
        // add entries to our map
        hashmap.put("L. Messi", 10);
        hashmap.put("C. Ronaldo", 7);
        hashmap.put("Neymar jr.", 11);
        hashmap.put("R. Lewandoski", 9);
        hashmap.put("D. Beckham", 23);

        // update
        hashmap.put("L. Messi", 19); // updates value of mapped key 10 -> 19

        // - .get()
        // returns the value mapped to the given key, and return null if no mapping
        // found for key.
        System.out.println(hashmap.get("L. Messi")); // 19
        System.out.println(hashmap.get("Pedri")); // null

        // - .remove()
        // just pass the unique key if it is present, and returns the value
        System.out.println(hashmap.remove("R. Lewandoski")); // 9
        System.out.println(hashmap.remove("Pedri")); // null

        // - .containsKey()
        // checks if key exists in our map
        System.out.println(hashmap.containsKey("Neymar jr.")); // true
        System.out.println(hashmap.containsKey("Pedri")); // false

        // - .putIfAbsent()
        // adds new entry if the key is not present in map
        hashmap.putIfAbsent("Jude", 5);
        hashmap.putIfAbsent("D. Beckham", 5); // will not enter

        // - .keySet()
        // gives array of keys (order not guaranteed)
        System.out.println(hashmap.keySet()); // [Neymar jr., L. Messi, C. Ronaldo, D. Beckham, Jude]

        // - .values()
        // gives array of values
        System.out.println(hashmap.values()); // [11, 19, 7, 23, 5]

        // - .entrySet()
        // gives array of all mapped keys and values pair
        System.out.println(hashmap.entrySet()); // [Neymar jr.=11, L. Messi=19, C. Ronaldo=7, D. Beckham=23, Jude=5]

        // ways to print the key and value of hashmap
        // 1. for..each loop, iterate through key
        for (String key : hashmap.keySet()) {
            System.out.printf("Player %s, number %d %n", key, hashmap.get(key));
        }
        System.out.println();

        // 2. iterating hashmap using entrySet() with Map.Entry
        for (Map.Entry<String, Integer> e : hashmap.entrySet()) {
            System.out.printf("Player %s, number %d %n", e.getKey(), e.getValue());
        }
        System.out.println();
        // 2.a var for Map.Entry<String, Integer>, becouse java will interprets each
        // element of entrySet() as a key–value pair
        for (var e : hashmap.entrySet()) {
            System.out.printf("Player %s, number %d %n", e.getKey(), e.getValue());
        }
    }
}
