import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add("a");
        al.add(2);
        al.add("B");
        al.add(null);
        System.out.println(al);
        al.remove(3);
        System.out.println(al);
    }
}
