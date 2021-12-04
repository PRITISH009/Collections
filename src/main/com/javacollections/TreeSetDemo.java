package com.javacollections;

import java.util.Set;
import java.util.TreeSet;

// Implements Set
public class TreeSetDemo {
    public static void main(String[] args) {
        // TreeSet
        // Implemented on BinarySearchTree => Order is maintained.

        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(5);

        // Display all the elements
        System.out.println(treeSet); // Output -> No fixed order, but 5 will occur only once.

        // Remove Element from set
        treeSet.remove(5);

        // Display all the elements
        System.out.println(treeSet); // Output -> All the numbers in any order except 5

        // Check if set contains a particular element
        System.out.println(treeSet.contains(1)); // Output -> true
        System.out.println(treeSet.contains(5)); // Output -> false

        // Number of elements present inside a set
        System.out.println(treeSet.size()); // Output -> 4

        // Clear all the elements of a set
        treeSet.clear();

        // Display all the elements of a set
        System.out.println(treeSet);

    }
}
