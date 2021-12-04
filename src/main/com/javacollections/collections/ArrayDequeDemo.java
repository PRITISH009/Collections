package com.javacollections.collections;

import java.util.ArrayDeque;

// Implements Queue
public class ArrayDequeDemo {
    public static void main(String[] args) {

        // Declaration
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // This is a type of queue in which we can add and delete elements from both the sides of the
        // queue. We can do a peek on both the sides as well.

        arrayDeque.offer(1); // Adds element at the end of the queue (Comes from Queue)
        arrayDeque.offer(2);
        arrayDeque.offerFirst(3); // Adds element at the front of the queue (Comes from ArrayDeque class)
        arrayDeque.offerLast(4); // Adds element at the end of the queue (Comes from ArrayDeque class)

        // Display all the elements of the ArrayDeque
        System.out.println(arrayDeque); // Output [3, 1, 2, 4]

        // Peek -> gives the first element of the queue
        System.out.println(arrayDeque.peek()); // Output -> 3 (Comes from Queue)

        // PeekFirst -> gives the first element of the queue
        System.out.println(arrayDeque.peekFirst()); // Output -> 3 (Comes from ArrayDeque)

        // PeekLast -> gives the last element of teh queue
        System.out.println(arrayDeque.peekLast()); // Output -> 4 (Comes form ArrayDeque)

        // Poll -> removes the first element in the queue
        System.out.println(arrayDeque.poll()); // Output -> 3 (Comes from Queue)

        // PollFirst -> removes the first element in the queue
        System.out.println(arrayDeque.pollFirst()); // Output -> 1

        // PollLast -> removes the last element in the queue
        System.out.println(arrayDeque.pollLast()); // Output -> 4

        // Display all the elements of the queue
        System.out.println(arrayDeque); // Output -> [2]

        // You can also implement stack using this. use pollLast and offerLast
    }
}
