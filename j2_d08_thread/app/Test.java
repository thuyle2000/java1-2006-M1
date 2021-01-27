/*
Test Thread duoc tao tu 2 lop MyRunnable va MyThread
 */
package app;

import demo.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Test {

    public static void main(String[] args) {
      
        //khoi tao 2 thread t1, t2
        Thread t1 = new MyThread();
        Thread t2 = new Thread(new MyRunable());
        
        //phat tin hieu cho 2 thread duoc thi hanh
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("\n *** Ket thuc chuong trinh ! *** \n");
        
    }
    
}
