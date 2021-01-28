package demoConcurrency;

/**
 *
 * @author ThuyLM
 */
import java.util.*;
import java.util.concurrent.*;

public class CallableDemo {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(6);
        List<Future<String>> list = new ArrayList<>();
 
        Callable callable = new Callable() {
            @Override
            public String call() throws Exception {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(100);
                        System.out.println("\t"+ Thread.currentThread().getName());
                        System.out.printf("\t%d. Hello from Callable\n", i+1);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }

                return Thread.currentThread().getName();
            }
        };

        for (int i = 0; i < 10; i++) {
            Future<String> future = executor.submit(callable);
            list.add(future);
        }

//        for (int i = 0; i < 10; i++) {
//            try {
//                System.out.println(i + ": " + list.get(i).get());
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
        
        
        for (Future<String> future : list) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException |ExecutionException ex) {
                ex.printStackTrace();
            }
        }
        executor.shutdown();
    }

}
