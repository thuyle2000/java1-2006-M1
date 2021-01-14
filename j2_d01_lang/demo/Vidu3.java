/*
Demo Regular Expression
 */
package demo;

import java.util.regex.*;
import java.util.*;

public class Vidu3 {

    public static void main(String[] args) {
        
        //kiem tra Nguon goc xuat su SP [US hoac VN hoac TL hoac UK]
        Scanner sc = new Scanner(System.in);
        String co = null;
        Matcher m = null;

        //tao mau qui tac
        Pattern p = Pattern.compile("USA|VN|TL|UK", Pattern.CASE_INSENSITIVE);

        while (true) {
            System.out.println("Nhap C.O.: ");
            co = sc.nextLine().trim();

            //khoi tao doi tuong kiem tra [m] : so sanh mau [p] voi chuoi nhap [name]
            m = p.matcher(co);
            if (!m.matches()) {
                System.out.println("Chung chi xuat su KO HOP LE !!! (us.uk.vn.tl)");
                System.out.println("Vui long nhap lai !");
                continue;
            }
            break;
        }

        System.out.printf("C.O. : %s \n", co);
    }

}
