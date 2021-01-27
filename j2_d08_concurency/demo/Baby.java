/*
    Runnable chuyen mon thuc hien giao dich rut tien
 */
package demo;

import java.util.*;

public class Baby implements Runnable {

    Account acc;

    public Baby(Account acc) {
        this.acc = acc;
    }

    @Override
    public void run() {

        //thuc hien rut tien [300-1000] cho den khi tai khoan de-activate 
        Random r = new Random();
        int amt = 0;

        for (int i = 0; acc.active; i++) {
            amt = 200 + r.nextInt(700);
            //rut tien khoi tai khoan
            System.out.printf("\t>> Baby: rut tien [%d] lan %d \n", amt, i + 1);

            acc.withdraw(amt);
           
            try {
                Thread.sleep(700); //delay .7s roi lai rut tien tiep !

            } catch (InterruptedException ex) {
                System.out.println("Loi: " + ex.getMessage());
            }
        }
        
        System.out.println("*** Finish: deactivate account ! ***");

    }
}


