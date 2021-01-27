/*
Runnable thuc hien giao dich nap tien
 */
package demo;

import java.util.*;

public class Papa implements Runnable{

    Account acc;

    public Papa(Account acc) {
        this.acc = acc;
    }
    
        
    @Override
    public void run() {
        
        //thuc hien 12 lan nap tien [100-1000]
        Random r = new Random();
        int amt = 0;
        
        for (int i = 0; i < 12; i++) {
            amt = 100+ r.nextInt(900);
            
            //nap tien vo tai khoan
            System.out.printf("*** Papa: nap tien [%d] lan %d ***\n", amt, i+1);
            
            acc.deposit(amt);
            
            try { 
                
                Thread.sleep(1000); //delay 1s roi nap tien tiep !
                
            } catch (InterruptedException ex) {
                System.out.println("Loi: " + ex.getMessage());
            }
           
        }
        
        acc.active = false;
        
    }
    
}
