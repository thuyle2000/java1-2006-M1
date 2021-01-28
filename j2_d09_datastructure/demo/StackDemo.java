/* demo cấu trúc stack */
package demo;

import java.util.*;

public class StackDemo {
    
    private static Stack init() {
        
        Stack stack = new Stack();
        stack.push("January");
        stack.push("Febuary");
        stack.push("March");
        stack.push("April");
        return stack;
    }

    public static void main(String[] args) {
        Stack st = StackDemo.init();
        
        System.out.println("\n---Elements in Stack---  ");
        st.forEach(System.out::println);
        
        System.out.println("\nObject on top: " + st.peek());
        System.out.printf("Position of [Febuary] from top: %s\n",st.search("Febuary"));
        System.out.println("Object popped out: " + st.pop());
        System.out.println("Object on top: " + st.peek());
        
        System.out.println("\n---Elements in Stack---  ");       
        st.forEach(System.out::println);
    }
}
