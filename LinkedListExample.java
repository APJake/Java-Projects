import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("a");
        ll.add(2);
        ll.add("B");
        ll.add(null);
        System.out.println(ll);
        ll.set(2,"C");
        ll.removeLast();
        ll.addFirst(3);
        System.out.println(ll);
    }
}
