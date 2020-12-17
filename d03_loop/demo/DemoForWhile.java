/*
demo vong lap while/do-while va for de tinh n!, voi n thuoc mien gia tri [0-15]
 */
package demo;

import java.util.Scanner;


public class DemoForWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        long kq = 1;
        
        //nhap va kiem tra n [0-15]
        while(true){
            System.out.println("nhap so nguyen N [0-15]: ");
            n = sc.nextInt();
            if(n >=0 && n<=15) {
                break ; //thoat vong lap
            }
        }
        
       
        //tinh va in ra giai thua cua n
        for(int i = 1; i <=n; i++){
            kq = kq * i;
        }
        System.out.println("Giai thua: " + kq);
    }
    
}
