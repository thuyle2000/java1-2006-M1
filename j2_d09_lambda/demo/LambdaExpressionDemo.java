/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author ThuyLM
 */
import java.util.*;

@FunctionalInterface
interface FunctionalA {
    int doWork(int a, int b);
}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        /*1: Using basic lambda */
        FunctionalA a1 = (int n1, int n2) -> n1 + n2;
        System.out.println("5+5= " + a1.doWork(5, 5));
        
        /*2: Using lambda with inferred types */
        FunctionalA a2 = (n1, n2) -> n1 + n2;
        System.out.println("5+10= " + a2.doWork(5, 10));
        
        /*3: Using lambda with expression body containing return statement */
        FunctionalA a3 = (n1, n2) -> {
            return n1 + n2;
        };
        System.out.println("5+15= " + a3.doWork(5, 15));
        
        /*4: Using lambda with expression body containing multiple statements */
        FunctionalA a4 = (n1, n2) -> {
            int sum = n1 + n2;
            int result = sum * 10;
            return result;
        };
        System.out.println("(5+10)*10= " + a4.doWork(5,10));
        
        /*Lambda 5: Passing lambda as method parameter to Arrays.sort() method*/
        String[] w = {"Hi", "Hello", "Hello World", "Holiday"};
        System.out.println("Original array:\n" + Arrays.toString(w));
        
        //Arrays.sort(w, (a,b) -> a.compareTo(b));
        //Arrays.sort(w, (first, second) -> Integer.compare(first.length(), second.length()));
        Arrays.sort(w, (a, b) -> a.length()- b.length());
        System.out.println("Sorted array by length using lambda:\n" + Arrays.toString(w));
    }
}
