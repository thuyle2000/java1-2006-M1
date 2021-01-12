
package demoMap;

import java.util.*;
public class ProductMapTest {


    public static void main(String[] args) {
        ProductMapTest p = new ProductMapTest();
        p.menu();
    }

    private void menu() {
        String op = null;
        ProductMap mc = new ProductMap();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n === MENU  [HashMap] === ");
            System.out.println("1. Them san pham");
            System.out.println("2. Xem danh sach san pham");
            System.out.println("3. Tim san pham theo ten");
            System.out.println("4. Save file");
            System.out.println("5. Thoat");
            System.out.println("  Chon chuc nang [1-5]: ");
            op = sc.nextLine().trim();

            switch (op) {
                case "1":
                    mc.add();
                    break;
                case "2":
                    mc.display();
                    break;
                case "3":
                    System.out.println(" Nhap ten san pham muon tim : ");
                    //mc.display(sc.nextLine().trim());
                    break;

                case "4":
                    mc.saveText();
                    break;
                    
                case "5":
                    return;
            }
        }
    }
    
}
