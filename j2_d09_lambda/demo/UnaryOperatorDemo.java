package demo;

import java.util.function.*;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        UnaryOperator<String> result = (x) -> x.toUpperCase();
        System.out.println("Output converted into uppercase:");
        System.out.println(result.apply("Hello Lambda"));
    }
}
