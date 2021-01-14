/*
Demo Regular Expression
 */
package demo;

import java.util.regex.*;
import java.util.*;
public class Vidu2 {

    public static void main(String[] args) {
        
        // kiem tra ten sp hop le : chua ky tu chu, so, khoang trang (2-30) 
        Scanner sc = new Scanner(System.in);
        String name = null;
        Matcher m = null;
        
        //tao mau qui tac
        Pattern p = Pattern.compile("[a-zA-Z\\s\\d]{2,30}");
        
        while (true) {
            System.out.println("Nhap ten SP: ");
            name = sc.nextLine().trim();

            //khoi tao doi tuong kiem tra [m] : so sanh mau [p] voi chuoi nhap [name]
            m = p.matcher(name);
            if (!m.matches()) {
                System.out.println("Ten KO HOP LE !!! (chu, so, khoang trang) ");
                System.out.println("Vui long nhap lai");
                continue;
            } 
            break;
        }  
        
        System.out.printf("Ten san pham : %s \n", name);
        
    }
    
}
