package demo;

/**
 *
 * @author ThuyLM
 */
public class MultiThreadedAnonymousDemo {
    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello from anonymous");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("\tHello from lambda");
                try {
                    Thread.sleep(120);
                } catch (Exception e) {
                }
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}
