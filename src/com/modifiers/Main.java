// Java program to practice public and private modifiers
package com.modifiers;

// Person class
class Person {

    public String name = "Arne"; // accessible everywhere
    private int age = 25; // accessible only in class
}

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        Person p = new Person();
        System.out.println(p.name); // Output: Arne
        System.out.println(p.age); // Compilation error
    }
}