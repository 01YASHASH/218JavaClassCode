package PRACTICE;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {
    ArrayDeque<String> deque = new ArrayDeque<>();
    deque.add("A");
    deque.addFirst("F");
    deque.addLast("L");
    deque.offer("C");
    deque.offerFirst("First");
    deque.offerLast("Last");
    System.out.println("First element (peek):"+deque.peek());
    System.out.println("First element (peekFirst)"+deque.peekFirst());
    System.out.println("Last element (peekLast)"+deque.peekLast());
    System.out.println("\nRemoving elements: ");
    System.out.println("Removed first(removeFirst):"+deque.removeFirst());
    System.out.println("Remove last(removeLast):"+deque.removeLast());
    System.out.println("Removed First(pollFirst):"+deque.pollFirst());
    System.out.println("Remove Last(pollLast):"+deque.pollLast());
    System.out.println("Is deque empty:"+deque.isEmpty());
    }
}
