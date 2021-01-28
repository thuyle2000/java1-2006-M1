package demo;

/**
 *
 * @author ThuyLM
 */
import java.util.function.*;

public class BinaryFunctionalInterfacesDemo {

    public static void main(String[] args) {
        // test BiPredicate
        BiPredicate<Integer, Integer> r1 = (arg1, arg2) -> arg1 < arg2;
        System.out.println("BiPredicate.test() result:  " + r1.test(5, 10));

        //test BiConsumer
        BiConsumer<String, String> r2 = (arg1, arg2) -> {
            System.out.println("BiConsumer.accept() result:  " + arg1 + arg2);
        };
        r2.accept("Hello ", "Lambda");

        //testthe default method andThen() of the BiFunction interface 
        BiFunction<Integer, Integer, Integer> function1 = (a, b) -> a + b;
        Function<Integer, Integer> function2 = (n) -> n * n;

        //Using andThen()
        System.out.println(function1.andThen(function2).apply(5, 3));
        System.out.println(function1.andThen(function2).apply(12, 2));

    }
}
