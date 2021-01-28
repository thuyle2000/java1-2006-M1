package demo;

/**
 *
 * @author ThuyLM
 */
import java.util.function.*;

public class PrimitiveFunctionalInterfacesDemo {

    public static void main(String[] args) {
        //test IntPredicate
        IntPredicate r1 = arg -> (arg == 10);
        System.out.println("IntPredicate.test() result:  " + r1.test(11));

        //test LongConsumer
        LongConsumer r2 = val -> System.out.println("LongConsumer.accept() result:  " + val * val);
        r2.accept(1000000);
    }
}
