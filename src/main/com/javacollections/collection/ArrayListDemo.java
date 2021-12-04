package com.javacollections.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


// Implements List interface
public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Adding numbers to list
        list.add(1);
        list.add(2);
        list.add(3);

        // Display the entire list
        System.out.println(list); // Output -> [1, 2, 3]

        // Adding an element to a particular position
        list.add(1, 50);

        // Display the entire list
        System.out.println(list); // Output -> [1, 50, 2, 3]

        // Concatenating 2 separate lists
        List<Integer> newList = new ArrayList<>();

        newList.add(100);
        newList.add(110);

        // addAll function adds all the elements in the list passed into the function into the caller list
        list.addAll(newList);

        System.out.println(list); // Output -> [1, 50, 2, 3, 100, 110]

        // To get element from a particular index
        System.out.println(list.get(1)); // Output -> 50

        // To remove element from a particular index
        System.out.println(list.remove(1)); // Output -> element removed

        // Display all the elements of the list
        System.out.println(list); // Output -> [1, 2, 3, 100, 110]

        // Removing a particular element (by value not index)
        System.out.println(list.remove(Integer.valueOf(110))); // Output -> true/false based on if the element is found

        // Display all the elements
        System.out.println(list); // Output -> [1, 2, 3, 110]

        // To update a particular element in the list
        list.set(3, 4); // Will set index 3 of the list to 4
        System.out.println(list); // Output -> [1, 2, 3 ,4]

        // To check if an element is present in the list or not
        System.out.println(list.contains(4)); // true/false based on if the value is present in the list or not

        // Iteration in the list

        // Method 1 - normal for loop
        for(int i=0; i<list.size(); i++) {
            System.out.println("Element - " + list.get(i));
        }

        // Method 2 - for each loop
        for(Integer element : list) {
            System.out.println("Element - " + element);
        }

        // Iterators in list
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            System.out.println("Element - " + it.next());
        }

        // To clear all the elements in the list
        list.clear();
        System.out.println(list); // Output -> []

    }

}
