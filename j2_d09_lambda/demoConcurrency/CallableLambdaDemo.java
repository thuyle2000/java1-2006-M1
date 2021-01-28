package demoConcurrency;

/**
 *
 * @author ThuyLM
 */
import java.util.*;
import java.util.concurrent.*;

public class CallableLambdaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<String>> list = new ArrayList<>();
        Callable callable = () -> {
            try {
                Thread.sleep(10);
                System.out.println("\t Hi from Callable - Lambda");
                return Thread.currentThread().getName();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            return Thread.currentThread().getName();
        };
        for (int i = 0; i < 10; i++) {
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        for (int i = 0; i<10; i++) {
            try {
                System.out.println(i+ ": "+list.get(i).get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}


