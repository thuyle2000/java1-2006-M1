/*
DEmo Set
 */
package demoSet;

import java.util.*;

public class Vidu2 {

    public static void main(String[] args) {
        //tao 1 ds ten sinh vien
        List<String> ds = Arrays.asList("Hien", "Minh", "Thinh", "Phat", "Trieu", "Thinh");

        //in ds sinh vien trog tap List
        System.out.println("*** Danh sach sinh vien - List");
        ds.forEach(System.out::println);

        //in ds sinh vien trog tap Hashset
        Set<String> ds1 = new LinkedHashSet<>(ds);
        System.out.println("*** Danh sach sinh vien - LinkedHashSet");
        ds1.forEach(System.out::println);

        //in ds sinh vien trog tap Hashset
        Set<String> ds2 = new HashSet<>(ds);
        System.out.println("*** Danh sach sinh vien - HashSet");
        ds2.forEach(System.out::println);

        //in ds sinh vien trog tap Treeset
        Set<String> ds3 = new TreeSet<>(ds);
        System.out.println("\n*** Danh sach sinh vien - TreeSet");
        ds3.forEach(System.out::println);
    }

}
