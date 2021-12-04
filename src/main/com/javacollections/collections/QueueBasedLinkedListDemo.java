package com.javacollections.collections;

import java.util.*;

// Linked List implements multiple interfaces - List and Queue
// It follows Last In First Out - i.e. addition happens from the last and removal happens from the first
public class QueueBasedLinkedListDemo {
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

    }
}
