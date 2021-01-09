/*
Demo Set
 */
package demoSet;

import java.util.*;

public class Vidu1 {

    public static void main(String[] args) {
        //tao 1 ds ten sinh vien
        List<String> ds = Arrays.asList("Hien", "Minh", "Thinh", "Phat", "Trieu", "Thinh", null);

        Set<String> ds2 = new HashSet<>(ds);
        
        
        //in ds sinh vien trog tap List
        System.out.println("*** Danh sach sinh vien - List");
        ds.forEach(System.out::println);
        
        //in ds sinh vien trong tap Set
        System.out.println("*** Danh sach sinh vien - Set");
        ds2.forEach(System.out::println);

    }
}
