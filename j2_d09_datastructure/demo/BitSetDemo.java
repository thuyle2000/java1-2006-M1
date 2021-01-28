package demo;

import java.util.*;
public class BitSetDemo {

    public static void main(String[] args) {
        BitSet b1 = new BitSet();
        BitSet b2 = new BitSet();
        
        b1.set(1);
        b1.set(5);
        b1.set(8);
        
        b2.set(3);
        b2.set(6);
        b2.set(9);
        
        System.out.println("Values in bitset1:"+b1 +
        "\nValues in bitset2: "+b2);
    }    
}
