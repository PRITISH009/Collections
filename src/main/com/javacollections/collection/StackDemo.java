package com.javacollections.collection;

import java.util.Stack;

// Last In First out type of DataStructure and Implements List Interface
public class StackDemo {
    public static void main(String[] args) {
        // Declaring stack of Animals
        Stack<String> animals = new Stack<>();

        // Adding new elements to the stack
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        // to view the top element there is a function called peek
        System.out.println(animals.peek()); // Output -> Cat

        // To pop the top element
        System.out.println(animals.pop()); // Output -> Cat, removes the top element of the stack

        // View the top element
        System.out.println(animals.peek()); // Output -> Horse

        // View all the elements in the stack
        System.out.println(animals); // Output -> [Lion, Dog, Horse]
    }
}
