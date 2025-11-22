package Heaps;

import java.util.HashSet;

public class SetsSTL {
    public static void main(String[] args) {
        // unordered_set
        HashSet<Integer> set = new HashSet<>();
        set.add(4); set.add(14); set.add(42); set.add(-4);
        System.out.println(set);
        System.out.println(set.contains(142)); // searching
        set.add(4);
        set.remove(4);
        // traversal
        for(int ele : set){
            System.out.print(ele+" ");
            // set.remove(ele); // error
            // set.remove(14); // error
        }
    }
}
