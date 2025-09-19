package PRACTICE;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();

        vec.add("John");
        vec.add("Sophia");
        vec.add("Arjun");
        vec.add(1, "Raj");

        System.out.println("Vector: " + vec);

        System.out.println("First element: " + vec.firstElement());
        System.out.println("Last element: " + vec.lastElement());
        System.out.println("Element at index 2: " + vec.get(2));

        vec.remove("Sophia");
        vec.remove(0);
        System.out.println("Vector after removals: " + vec);

        System.out.println("Contains 'Raj'? " + vec.contains("Raj"));

        System.out.println("Size of Vector: " + vec.size());
        System.out.println("Capacity of Vector: " + vec.capacity());

        System.out.println("Iterating elements:");
        for (String name : vec) {
            System.out.println(name);
        }

        vec.clear();
        System.out.println("After clear, size = " + vec.size());
    }
}