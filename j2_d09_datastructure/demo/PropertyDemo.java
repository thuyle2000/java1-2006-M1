package demo;

import java.util.*;
public class PropertyDemo {
    
    private static Properties init() {
        Properties p = new Properties();
        p.setProperty("1", "East");
        p.setProperty("2", "West");
        p.setProperty("3", "North");
        p.setProperty("4", "South");
        return p;
    }
    
    public static void main(String[] args) {
        Properties p = PropertyDemo.init();
        Set s = p.keySet();
        
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.printf("value of %s is %s\n", str, p.getProperty(str));
        }
        
        
    }
}
