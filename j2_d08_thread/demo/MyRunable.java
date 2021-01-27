/*
Tao 1 lop co kha nang phuc vu nhu 1 thread : 
    xuat 1 thong bao 30 lan - moi lan cach nhau .3s
Su dung Phuong phap tao lop implement Runnable
 */
package demo;

public class MyRunable implements Runnable{

    //lap trinh cho nhiem vu cua thread trong ham run()
    @Override
    public void run() {
        String message = ">> Goodbye, 2020 !!!";
        for (int i = 0; i < 30; i++) {
            System.out.printf("\t%2d. %s\n",i+1, message);
            
            try {
                //ngung 0.3s
                Thread.sleep(300);
                
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
    
}
