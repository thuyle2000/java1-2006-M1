/*
mo ta 1 tai khoan ngan hang
 */
package demo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {

    public int balance = 1000;
    public boolean active = true;

    //method nap tien
    public synchronized void deposit(int amt) {
        balance += amt;
        System.out.printf("*** Giao dich nap tien [%d] thanh cong. *** , so du: [%d]\n", amt, balance);
        notify();
    }

    //method rut tien
    public synchronized void withdraw(int amt) {
        
        while (active || amt < balance) {
            if (amt < balance) {
                balance -= amt;
                System.out.printf("\t>> Giao dich rut tien [%d] thanh cong, so du: [%d] \n", amt, balance);
                break;
            }

            System.out.printf("\t>> Giao dich rut tien [%d] chua thuc hien duoc, so du: [%d]. Cho 1 chut ... \n", amt, balance);
            try {
                wait(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("=== So du: %d ====\n", balance);
    }

}
