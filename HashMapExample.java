import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put("loki",999);
        hm.put("amk",888);
        hm.put("cmt",777);
        System.out.println(hm);
        Set kset = hm.keySet();
        System.out.println(kset);
        Collection vset = hm.values();
        System.out.println(vset);
        Set entrySet = hm.entrySet();
        System.out.println(entrySet);

        Iterator itr = entrySet.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+" ... "+m1.getValue());
            if(m1.getKey().equals("loki")){
                m1.setValue(10000);
            }
        }

        System.out.println(hm);

    }
}
