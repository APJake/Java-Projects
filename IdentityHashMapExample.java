import java.util.*;

public class IdentityHashMapExample {
    public static void main(String[] args) {
        IdentityHashMap hm = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        hm.put(i1,"loki");
        hm.put(i2,"amk");
        System.out.println(hm);
    }
}
