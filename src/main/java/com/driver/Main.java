package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3
        RWOnly obj = new RWOnly();

        // Task 4
        // obj.name = "John"; // Error: The variable name is private and cannot be accessed directly
        // System.out.println(obj.name); // Error: The variable name is private and cannot be accessed directly

        // Task 6
        obj.setName("John");
        System.out.println(obj.getName()); // Output: John
    }
}
