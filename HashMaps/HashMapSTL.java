package Heaps;

import java.util.HashMap;

public class HashMapSTL {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Raghav",76); // add
        map.put("Tuhin",45);
        map.put("Arjun",50);
        map.put("Neeraj",18);
        map.put("Shashank",44);

        System.out.println(map.get("Neeraj")); // O(1)
        System.out.println(map.containsKey("Prathmesh")); // O(1)
        map.put("Prathmesh",63); // O(1)
        map.remove("Shashank"); // O(1)
        map.put("Arjun",55); // replace

        // Traversal
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

    }
}
