/*
Demo List
 */
package demoList;

import java.util.*;
public class Vidu1 {

    public static void main(String[] args) {
        //tao 1 ds ten sinh vien
        List<String> ds = Arrays.asList("Hien","Minh","Thinh", "Phat","Trieu","Thinh",null);
        
        //in ds sinh vien
        System.out.println("Danh sach sinh vien");
        
        ds.forEach(System.out::println);
        
    }
    
}
