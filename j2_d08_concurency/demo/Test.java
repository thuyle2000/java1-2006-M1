
package demo;

public class Test {

    public static void main(String[] args) {
        System.out.println(" === DEMO BANKING ===");
        
        Account tk = new Account();
        
        Thread daddy = new Thread(new Papa(tk));
        Thread son = new Thread(new Baby(tk));
        
        daddy.start();
        son.start();
        
        
        try {
            daddy.join();
            son.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("\n >> THE END <<");
    }
    
}
