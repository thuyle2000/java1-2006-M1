/*
Test Thread duoc tao tu 2 lop MyRunnable va MyThread
 */
package app;

import demo.*;

public class Test2 {

    public static void main(String[] args) {
        //khoi tao 2 thread t1, t2
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunable());

        //khoi tao thread thu 3 bang bieu thuc lambda
        Thread t3 = new Thread(() -> {
            String message = ">> Goodbye, n-Covid !!!";
            for (int i = 0; i < 45; i++) {
                System.out.printf("\t\t%2d. %s\n", i + 1, message);

                try {
                    //ngung 0.4s
                    Thread.sleep(400);

                } catch (InterruptedException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
            }
        });

        //set t3 thanh deamon thread
        t3.setDaemon(true);
        
        //phat tin hieu cho 3 thread duoc thi hanh
        t1.start();
        t2.start();
        t3.start();
        
    }

}
