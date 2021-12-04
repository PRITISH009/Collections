package com.javacollections;

import java.util.LinkedHashSet;
import java.util.Set;

// Implements Set
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // Each element is linked with the next element hence ordering is maintained
        // (Ordered in nature) Rest everything is same
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(5);

        // Display all the elements
        System.out.println(linkedHashSet); // Output -> No fixed order, but 5 will occur only once.

        // Remove Element from set
        linkedHashSet.remove(5);

        // Display all the elements
        System.out.println(linkedHashSet); // Output -> All the numbers in any order except 5

        // Check if set contains a particular element
        System.out.println(linkedHashSet.contains(1)); // Output -> true
        System.out.println(linkedHashSet.contains(5)); // Output -> false

        // Number of elements present inside a set
        System.out.println(linkedHashSet.size()); // Output -> 4

        // Clear all the elements of a set
        linkedHashSet.clear();

        // Display all the elements of a set
        System.out.println(linkedHashSet);

    }
}
