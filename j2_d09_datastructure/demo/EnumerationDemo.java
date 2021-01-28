package demo;

import java.util.*;
public class EnumerationDemo {

    public static void main(String[] args) {
        String[] strArray = {"One", "Two", "Three"};
        Enumeration e = new CustomEnumeration(strArray);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
