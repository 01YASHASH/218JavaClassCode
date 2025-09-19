package PRACTICE;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        
    
    LinkedList<String> ll=new LinkedList<>();
    ll.add("john");
        ll.add("Sophia");
        ll.addFirst("Arjun");
        ll.add(3, "raj");
        System.out.println("LinkedList: " + ll);
        System.out.println("First element: " + ll.getFirst());
        System.out.println("Last element: " + ll.getLast());
        System.out.println("Element at index 2: " + ll.get(2));
        ll.remove("Sophia"); 
        ll.removeFirst();     
        ll.removeLast();      
        System.out.println("LinkedList after removals: " + ll);
        System.out.println("Contains 'john'? " + ll.contains("john"));
        System.out.println("Size of LinkedList: " + ll.size());
        System.out.println("Iterating over elements:");
        for (String name : ll) {
            System.out.println(name);
        }
        ll.clear();
        System.out.println("After clear, size = " + ll.size());
}
}
