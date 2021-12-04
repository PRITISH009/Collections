package com.javacollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Implements Set interface
// Duplicate elements are not allowed inside a set
// There is no order of storing elements because of hashing
// Hash of an element will be fixed and there is a unique hash for each element.
public class HashSetDemo {
    public static void main(String[] args) {

        System.out.println("HashSet");

        // Declaration
        Set<Integer> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(5);

        // Display all the elements
        System.out.println(hashSet); // Output -> No fixed order, but 5 will occur only once.

        // Remove Element from set
        hashSet.remove(5);

        // Display all the elements
        System.out.println(hashSet); // Output -> All the numbers in any order except 5

        // Check if set contains a particular element
        System.out.println(hashSet.contains(1)); // Output -> true
        System.out.println(hashSet.contains(5)); // Output -> false

        // Number of elements present inside a set
        System.out.println(hashSet.size()); // Output -> 4

        // Clear all the elements of a set
        hashSet.clear();

        // Display all the elements of a set
        System.out.println(hashSet);

    }
}
