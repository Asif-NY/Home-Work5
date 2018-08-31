package dataStructure;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(3702, "Asif");
        hm.put(3456, "Jhon");
        hm.put(344,"David");
        System.out.println(hm.get(3702));
        System.out.println(hm.get(3456));

    }

}
