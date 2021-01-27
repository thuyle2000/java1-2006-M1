/*
Tao 1 lop thread : xuat 1 thong bao 20 lan - moi lan cach nhau .5s
Su dung Phuong phap tao lop con cua Thread 
 */
package demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    //lap trinh cho nhiem vu cua thread trong ham run()
    @Override
    public void run() {
        String message = ">> Hello, Tet 2021 !!!";
        for (int i = 0; i < 20; i++) {
            System.out.printf("%2d. %s\n",i+1, message);
            
            try {
                //ngung 0.5s
                Thread.sleep(500);
                
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }

}
