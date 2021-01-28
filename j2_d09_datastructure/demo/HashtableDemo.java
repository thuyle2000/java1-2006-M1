package demo;

import java.util.*;
public class HashtableDemo {
    
    private static Hashtable init() {
        String[] s = {"East", "West", "North", "South"};
        Hashtable table = new Hashtable();
        
        for (int i = 0; i < s.length; i++) {
            table.put(i, s[i]);
        }
        return table;
    }

    public static void main(String[] args) {
        Hashtable h = HashtableDemo.init();
        Enumeration e = h.keys();
        
        System.out.println("---Hashtable Key-Value Pairs---");
        while (e.hasMoreElements()) {
            Object key = e.nextElement();
            System.out.println(key + " : " + h.get(key));
        }
        
        System.out.println("---Hashtable Keys---");
        h.keySet().forEach(System.out::println);
        
        System.out.println("---Hashtable Values---");
        h.values().forEach(System.out::println);
        
    }
}

