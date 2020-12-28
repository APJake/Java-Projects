
import java.util.*;

class Temp{
    public String toString(){
        return "temp";
    }
}

public class WeakHashMapExample {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Temp t = new Temp();
        hm.put(t, "loki");
        System.gc();
    }
}
