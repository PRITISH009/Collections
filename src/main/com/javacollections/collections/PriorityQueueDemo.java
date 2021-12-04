package com.javacollections.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Implements Queue interface.
// By default it is like a sorted queue (ascending order) i.e. the lowest element has the highest priority
// Priority can be defined by us as well
// Under the hood it implements Min Heap Data Structure
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Declaration
        Queue<Integer> pq = new PriorityQueue<>();

        // Add elements to the Priority Queue
        pq.offer(5);
        pq.offer(6);
        pq.offer(4);
        pq.offer(1);
        pq.offer(2);

        // Display all the elements of a queue
        System.out.println(pq); // Output -> [1, 2, 5, 6, 4] // BFS/DFS order in min heap

        // Gets the first element from the queue
        System.out.println(pq.peek()); // Output -> 1

        // Remove the first element from the queue
        System.out.println(pq.poll()); // Output -> 1

        System.out.println(pq); // Output -> [2, 4, 5, 6]

        // Automatic implementation of heapify

        // To change priority -

        // Reverses in order
        Queue<Integer> rpq = new PriorityQueue<>(Comparator.reverseOrder());

        // Add elements
        rpq.offer(1);
        rpq.offer(6);
        rpq.offer(7);
        rpq.offer(3);
        rpq.offer(4);

        // Display all the elements
        System.out.println(rpq); // Output -> [7, 4, 6, 1, 3]

        // Peek
        System.out.println(rpq.peek()); // Output -> 7

        // Poll
        System.out.println(rpq.poll()); // Output -> 7

        // Display all the elements
        System.out.println(rpq); // Output -> [6, 4, 3 ,1]

    }
}
