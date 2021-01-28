package demo;

import java.util.function.*;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {
        /* test Predicate */
        Predicate<String> r1 = arg -> (arg.equals("Hello Lambda"));
        String testStr = "Hello Lambda";
        System.out.println(r1.test(testStr));

        /* test Consumer */
        Consumer<String> r2 = str -> System.out.println(str.toUpperCase());
        r2.accept("hello lambda");

        /* test Supplier */
        Supplier r4 = () -> {
            String s = "[Hello lambda]";
            return s;
        };
        System.out.println(r4.get());

        /* test Function */
        Function<String, Integer> r3 = str -> str.length();
        System.out.println(r3.apply("Hello Lambda"));
    }
}
