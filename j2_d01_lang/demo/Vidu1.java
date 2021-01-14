/*
Demo Regular Expression
 */
package demo;

import java.util.regex.*;
import java.util.*;

public class Vidu1 {

    public static void main(String[] args) {
        //kiem tra ma so san pham : Bxxx, hoac Fxxx, hoac Pxxx voi x la so
        Scanner sc = new Scanner(System.in);
        String id = null;
        Matcher m = null;

        //tao mau qui tac
        Pattern p = Pattern.compile("[BFP]\\d{3}");

        while (true) {
            System.out.println("Nhap ma SP: ");
            id = sc.nextLine().trim();

            //khoi tao doi tuong kiem tra [m] : so sanh mau [p] voi chuoi nhap [id]
            m = p.matcher(id);
            if (!m.matches()) {
                System.out.println("Ma so Ko HOP LE !!! ([BFP]xxx) ");
                System.out.println("Vui long nhap lai");
                continue;
            } 
            break;
        }        
        System.out.printf("Ma so san pham : %s \n", id);

    }

}
