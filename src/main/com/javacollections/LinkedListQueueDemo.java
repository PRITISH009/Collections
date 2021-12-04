package com.javacollections;

import java.util.*;

// Linked List implements multiple interfaces - List and Queue
// It follows Last In First Out - i.e. addition happens from the last and removal happens from the first
public class LinkedListQueueDemo {
    public static void main(String[] args) {

        System.out.println("Queue Implementation of LinkedList");
        // Both Array List and Linked List can implement Queue
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println(queue);

        // Remove the first element from the queue
        System.out.println(queue.poll()); // Output -> 1

        // Get the first element in the queue
        System.out.println(queue.peek());

        /* Adjacent functions to offer, peek and poll if we need to throw exception in case the operation
           is not successful
        */

        /*
            add() - adjacent to offer function, offer() returns true or false based on if the task of adding
            a new element to the queue is successful, add() on the other hand if the the operation fails
            throws an exception instead of returning a false. Returns true if the operation is successful
        */

        /*
            element() - adjacent to peek function, peek() returns the first element if the queue is not
            empty and returns null if the queue is empty. Whereas element() when the queue is empty throws
            an exception instead of null. Returns the first element if the queue is not empty.
        */

        /*
            remove() - adjacent to poll function, poll() removes the first element if the queue is not
            empty and returns null if the queue is empty. Whereas remove() when the queue is empty throws
            an exception instead of null. Returns the first element if the queue is not empty.
        */

        // It is recommended that we use offer, peek and poll for CP purposes.

        // These adjacent functions comes from List interface (same as ArrayList) whereas the discussed
        // methods comes from Queue interface. Since LinkedList implements both List and Queue Interface,
        // it has all the functions that are present in List interface.

        System.out.println("List implementation of LinkedList");
        // You can see it below. Just copying the code from ArrayListDemo and just changing the class
        // to LinkedList, everything works fine.
        List<Integer> list = new LinkedList<>();

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
        List<Integer> newList = new LinkedList<>();

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
